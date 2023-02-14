package backtracking;

import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/** 
* Combine Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 13, 2023</pre> 
* @version 1.0 
*/ 
public class CombineTest {
    @Test
    public void testRun() throws Exception {
        Combine combine = new Combine(3, 2);
        LinkedList<LinkedList<Integer>> actual = combine.run();
        LinkedList<LinkedList<Integer>> expected = new LinkedList<>();
        expected.add(new LinkedList<>(Arrays.asList(2, 3)));
        expected.add(new LinkedList<>(Arrays.asList(1, 3)));
        expected.add(new LinkedList<>(Arrays.asList(1, 2)));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
