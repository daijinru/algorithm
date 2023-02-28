package backtracking;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Test;
import src.TestBase;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/** 
* TopKFrequent Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 2, 2023</pre> 
* @version 1.0 
*/
public class TopKFrequentTest extends TestBase {
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun() throws Exception {
        Integer[] numbers = new Integer[]{1, 2, 2, 1, 3, 1};
        Integer k = 2;
        TopKFrequent topKFrequent = new TopKFrequent(numbers, k);
        List<Integer> expected = new LinkedList<>(Arrays.asList(2, 1));
        assertArrayEquals(expected.toArray(), topKFrequent.run().toArray());
    }
} 
