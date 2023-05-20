package array;

import org.junit.Test;
import static org.junit.Assert.*;
public class TwoSumSortedTest {
    @Test
    public void testRun() throws Exception {
        int[] in = new int[]{2, 2, 3, 4, 5, 8};
        TwoSumSorted twoSumSorted1 = new TwoSumSorted();
        assertArrayEquals(new int[]{3, 4}, twoSumSorted1.runSorted(in, 9));

        int[] in2 = new int[]{2, 4, 5};
        TwoSumSorted twoSumSorted2 = new TwoSumSorted();
        assertArrayEquals(new int[]{1, 2}, twoSumSorted2.runSorted(in2, 9));
    }
} 
