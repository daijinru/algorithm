package binaryTree;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Test;
import src.TestBase;

import static org.junit.Assert.*;

/** 
* Deserialize Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 3, 2023</pre> 
* @version 1.0 
*/ 
public class DeserializeTest extends TestBase {

    /**
    *
    * Method: run()
    *
    */
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun() throws Exception {
        String in = "1,3,#,#,5,3,#,#,7,#,#";
        Deserialize deserialize = new Deserialize(in, "#");
        TreeNode<Integer> node = deserialize.run();
        String serialize = Deserialize.serialize(node, "#");
        assertEquals(in, serialize);
    }

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun_02() throws Exception {
        String in = "1,2,#,#,4,5,#,#,3,6,#,#,7,#,#";
        Deserialize deserialize = new Deserialize(in, "#");
        String serialize = Deserialize.serialize(deserialize.run(), "#");
        assertEquals(in, serialize);
    }
} 
