package string;

public class StringUtils {
    static boolean isPalindrome(String in) {
        IsPalindrome isPalindrome = new IsPalindrome(in);
        return isPalindrome.run();
    }
}
