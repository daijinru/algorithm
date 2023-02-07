package string;

// @Todo conditions abstraction
public class IsPalindrome {
    public String input;
    public IsPalindrome(String input) {
        this.input = input;
    }

    public boolean run() {
        int i = 0;
        int j = this.input.length() - 1;

        while (i < j) {
            char ch1 = this.input.charAt(i);
            char ch2 = this.input.charAt(j);

            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
