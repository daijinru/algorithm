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
        Subsets subsets = new Subsets(new Integer[]{1, 2});
        List<List<Integer>> actual = subsets.run();
        List<List<Integer>> expected = new LinkedList<>();
        expected.add(new LinkedList<>());
        expected.add(new LinkedList<>(Arrays.asList(2)));
        expected.add(new LinkedList<>(Arrays.asList(1)));
        expected.add(new LinkedList<>(Arrays.asList(1, 2)));
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testHelper() throws Exception {
        Integer[] numbers1 = new Integer[]{};
        List<List<Integer>> result1 = new LinkedList<>();

        Subsets subsets = new Subsets(new Integer[]{1, 2});
        subsets.helper(numbers1, 0, new LinkedList<>(), result1);
        List<List<Integer>> actual1 = new LinkedList<>();
        actual1.add(new LinkedList<>(Arrays.asList()));
        assertArrayEquals(result1.toArray(), actual1.toArray());

        // Test2
        Integer[] numbers2 = new Integer[]{1};
        List<List<Integer>> result2 = new LinkedList<>();
        List<List<Integer>> expected1 = new LinkedList<>();
        expected1.add(new LinkedList<>(Arrays.asList()));
        expected1.add(new LinkedList<>(Arrays.asList(1)));

        subsets.helper(numbers2, 0, new LinkedList<>(), result2);
        assertArrayEquals(expected1.toArray(), result2.toArray());
    }
} 
