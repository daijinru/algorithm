package sort;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.*;

/** 
* SleepSort Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 11, 2023</pre> 
* @version 1.0 
*/ 
public class SleepSortTest {
    @Test
    public void testRun() throws Exception {
        int[] in = new int[]{5, 22, 10, 7, 59, 3, 16, 4, 11, 8, 14, 24, 27, 25, 26, 28, 23, 99};
        int[] expected = new int[]{3, 4, 5, 7, 8, 10, 11, 14, 16, 22, 23, 24, 25, 26, 27, 28, 59, 99};
        SleepSort.run(in);
        int[] out = ArrayUtil.ListIntegerToInts(SleepSort.out);
        assertArrayEquals(expected, out);
    }
}
