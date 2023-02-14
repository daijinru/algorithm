package backtracking;

import org.junit.Test; 

import java.util.*;

import static org.junit.Assert.*;

/** 
* Subsets Tester. 
* 
* @author <Authors name> 
* @since <pre>12ÔÂ 30, 2022</pre> 
* @version 1.0 
*/ 
public class SubsetsTest {

    @Test
    public void testRun() throws Exception {
        Subsets subsets = new Subsets(new int[]{1, 2});
        LinkedList<LinkedList<Integer>> actual = subsets.run();
        LinkedList<LinkedList<Integer>> expected = new LinkedList<>();
        expected.add(new LinkedList<>());
        expected.add(new LinkedList<>(Arrays.asList(2)));
        expected.add(new LinkedList<>(Arrays.asList(1)));
        expected.add(new LinkedList<>(Arrays.asList(1, 2)));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
} 
