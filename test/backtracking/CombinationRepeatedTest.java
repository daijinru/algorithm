package backtracking;

import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;
/** 
* CombinationRepeated Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 14, 2023</pre> 
* @version 1.0 
*/ 
public class CombinationRepeatedTest {
    @Test
    public void testRun() throws Exception {
        int[] c = new int[]{1, 2};
        LinkedList<LinkedList<Integer>> expected = new LinkedList<>();

        expected.add(new LinkedList<>(Arrays.asList(3, 5)));
        expected.add(new LinkedList<>(Arrays.asList(2, 3, 3)));
        expected.add(new LinkedList<>(Arrays.asList(2, 2, 2, 2)));

        CombinationRepeated cr = new CombinationRepeated(new int[]{2, 3, 5}, 8);
        assertArrayEquals(expected.toArray(), cr.run().toArray());
    }


} 
