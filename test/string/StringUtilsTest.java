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
} 
