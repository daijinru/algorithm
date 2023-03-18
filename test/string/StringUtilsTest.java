package string;

import org.junit.Test; 
import static org.junit.Assert.*;

public class StringUtilsTest {
    /**
    *
    * Method: isPalindrome(String in)
    *
    */
    @Test
    public void testIsPalindrome() throws Exception {
        assertFalse(StringUtils.isPalindrome("Hele elhe"));
        assertTrue(StringUtils.isPalindrome("Hele eleH"));
    }

    @Test
    public void testValidPalindrome() throws Exception {
        assertTrue(StringUtils.validPalindrome("abca"));
        assertTrue(StringUtils.validPalindrome("abcdcba"));
        assertFalse(StringUtils.validPalindrome("abeda"));
        assertFalse(StringUtils.validPalindrome("abcccdea"));
    }

    @Test
    public void testMinWindow() throws Exception {
        String actual = StringUtils.minWindow("ADDBANCAD", "ABC");
        assertEquals("BANC", actual);

        String actual2 = StringUtils.minWindow("ABAACBAB", "ABC");
        assertEquals("ACB", actual2);
    }

    @Test
    public void longestCommonPrefix() throws Exception {
        String[] input = new String[]{"flower", "flow", "flownlp", "flowcv"};
        String actual = StringUtils.longestCommonPrefix(input);
        assertEquals("flow", actual);

        String[] input_2 = new String[]{"a", "b", "c", "d"};
        String actual_2 = StringUtils.longestCommonPrefix(input_2);
        assertEquals("", actual_2);
    }
} 
