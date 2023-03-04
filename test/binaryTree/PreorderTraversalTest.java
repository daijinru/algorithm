package binaryTree;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Test;
import src.TestBase;
import utils.ArrayUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/** 
* PreorderTraversal Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 4, 2023</pre> 
* @version 1.0 
*/ 
public class PreorderTraversalTest extends TestBase {
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun() throws Exception {
        String in = "1,2,4,5,3,6,7";
        Deserialize deserialize = new Deserialize(in, "");
        PreorderTraversal preorder = new PreorderTraversal(deserialize.run());
        List<Integer> expected = Arrays.asList(ArrayUtil.IntsToIntegers(new int[]{1,2,4,5,3,6,7}));
        assertEquals(expected, preorder.run());
    }
} 
