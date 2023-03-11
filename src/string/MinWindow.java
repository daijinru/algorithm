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
        for (char ch: t.toCharArray()) {
            charToCount.put(ch, charToCount.getOrDefault(ch, 0) + 1);
        }

        // hashmap that stores all char counts for t.
        int count = charToCount.size();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        int minLength = Integer.MAX_VALUE;
        while (end < s.length() || (count == 0 && end == s.length())) {
            if (count > 0) {
                char endCh = s.charAt(end);
                // char counts of hashmap should be less than or equal to 0, if s contains all chars of t.
                if (charToCount.containsKey(endCh)) {
                    charToCount.put(endCh, charToCount.get(endCh) - 1);
                    if (charToCount.get(endCh) == 0) {
                        count--;
                    }
                }
                end++;
            } else {
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
