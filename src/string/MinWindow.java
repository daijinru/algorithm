package string;

import java.util.HashMap;

public class MinWindow {
    private String s;
    private String t;
    public MinWindow(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public String run() {
        HashMap<Character, Integer> charToCount = new HashMap<>();
        /**
         * HashMap that stores all char counts for t.
         *  ```
         *   A 1
         *   B 1
         *   C 1
         *  ```
         */
        for (char ch: t.toCharArray()) {
            charToCount.put(ch, charToCount.getOrDefault(ch, 0) + 1);
        }

        int count = charToCount.size();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        int minLength = Integer.MAX_VALUE;
        while (end < s.length() || (count == 0 && end == s.length())) {
            /**
             * Char counts of hashmap should be less than or equal to 0, if s contains all chars of t.
             * So at a moment end moves to a position and count = 0,
             * it gets ADDBANCA.
             * ```
             * A      D D B A N C   A      D
             * start               end
             * ```
             *
             */
            if (count > 0) {
                /**
                 * At some time to get the result that S contains all char of T,
                 * try to move start until a char belonging to T is removed.
                 * Back here, try moving the end to see if we can get all char back.
                 * ```
                 * A D    D      B      A N    C     A D
                 *    minStart  start       minEnd     end ->
                 * ```
                 */
                char endCh = s.charAt(end);
                if (charToCount.containsKey(endCh)) {
                    charToCount.put(endCh, charToCount.get(endCh) - 1);
                    if (charToCount.get(endCh) == 0) {
                        count--;
                    }
                }
                end++;
            } else {
                /**
                 * Returns above after count++ > 0
                 * ```
                 * A D   D        B     A N C   A      D
                 *     minStart start         minEnd
                 * ```
                 */
                if (end - start < minLength) {
                    minLength = end - start;
                    minStart = start;
                    minEnd = end;
                }
                char startCh = s.charAt(start);
                if (charToCount.containsKey((startCh))) {
                    charToCount.put(startCh, charToCount.get(startCh) + 1);
                    if (charToCount.get(startCh) == 1) {
                        count ++;
                    }
                }
                start ++;
            }
        }
        return minLength < Integer.MAX_VALUE
                ? s.substring(minStart, minEnd)
                : "";
    }
}
