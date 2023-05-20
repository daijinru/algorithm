package array;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {
@Test
public void testRun() throws Exception {
    TwoSum ts = new TwoSum(new int[]{2, 7, 11, 15}, 9);
    assertArrayEquals(new int[]{0, 1}, ts.run());

    TwoSum ts2 = new TwoSum(new int[]{3, 2, 4}, 6);
    assertArrayEquals(new int[]{1, 2}, ts2.run());

    TwoSum ts3 = new TwoSum(new int[]{1, 1}, 3);
    assertArrayEquals(new int[]{}, ts3.run());
}


} 
