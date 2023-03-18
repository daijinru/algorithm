package string;

public class StringUtils {
    static boolean isPalindrome(String in) {
        IsPalindrome isPalindrome = new IsPalindrome(in);
        return isPalindrome.run();
    }

    static boolean validPalindrome(String in) {
        ValidPalindrome validPalindrome = new ValidPalindrome(in);
        return validPalindrome.run();
    }

    static String minWindow(String s, String t) {
        MinWindow minWindow = new MinWindow(s, t);
        return minWindow.run();
    }

    static String longestCommonPrefix(String[] in) {
        LongestCommonPrefix lcp = new LongestCommonPrefix(in);
        return lcp.run();
    }
}
