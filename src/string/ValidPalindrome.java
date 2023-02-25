package string;

public class ValidPalindrome {
    String input;
    int start = 0;
    int end;
    public ValidPalindrome(String in) {
        this.input = in;
        this.end = this.input.length() - 1;
    }

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
