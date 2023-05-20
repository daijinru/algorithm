package array;

import org.junit.Test;
import static org.junit.Assert.*;
public class TwoSumTest {
    @Test
    public void testRun() throws Exception {
        int[] in = new int[]{2, 2, 3, 4, 5, 8};
        TwoSum twoSum1 = new TwoSum();
        assertArrayEquals(new int[]{3, 4}, twoSum1.runSorted(in, 9));

        int[] in2 = new int[]{2, 4, 5};
        TwoSum twoSum2 = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, twoSum2.runSorted(in2, 9));
    }
} 
