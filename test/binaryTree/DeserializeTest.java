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
        String in = "6,6,#,#,6,6,#,#,6,#,#";
        Deserialize deserialize = new Deserialize(in, "#");
        String serialize = Deserialize.serialize(deserialize.run(), "#");
        assertEquals(in.replaceAll("#", ""), serialize);
    }
} 
