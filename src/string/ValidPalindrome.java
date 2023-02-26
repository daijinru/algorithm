package string;

/**
 * Remove at most one char to get a Palindrome.
 */
public class ValidPalindrome {
    String input;
    int start = 0;
    int end;
    public ValidPalindrome(String in) {
        this.input = in;
        this.end = this.input.length() - 1;
    }

    /**
     * In 1st Loop find the unequal char.
     * Then skip the char continue to compare (end - 1 or start + 1).
     * If comparison above is unequal, then:
     * 1) if (start >= end) return true, it means chars compared earlier are all equal.
     * 2) if not it means it is not a palindrome.
     * @return
     */
    public boolean run() {
        for (; start < input.length() /2; ++start, --end) {
            if (input.charAt(start) != input.charAt(end)) {
                break;
            }
        }

        return start == input.length() / 2
                || helper(input, start, end - 1)
                || helper(input, start + 1, end);
    }

    private boolean helper(String in, int start, int end) {
        while (start < end) {
            if (in.charAt(start) != in.charAt(end)) {
                break;
            }

            start ++;
            end --;
        }
        return start >= end;
    }
}
