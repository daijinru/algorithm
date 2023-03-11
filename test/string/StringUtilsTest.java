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
        System.out.println(actual);
    }
} 
