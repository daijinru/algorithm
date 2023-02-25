package string;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidPalindromeTest {

    /**
     * Method: run()
     */
    @Test
    public void testRun() throws Exception {
        assertTrue(StringUtils.validPalindrome("abca"));
        assertFalse(StringUtils.validPalindrome("abeda"));
    }

}
