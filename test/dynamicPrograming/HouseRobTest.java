package dynamicPrograming;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Test;
import src.TestBase;

import static org.junit.Assert.*;

/** 
* HouseRob Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 4, 2023</pre> 
* @version 1.0 
*/ 
public class HouseRobTest extends TestBase {

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun() throws Exception {
        HouseRob houseRob = new HouseRob(new int[]{2, 3, 4, 5, 3});
        assertEquals(9, houseRob.run());
    }

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testRun01() throws Exception {
        HouseRob houseRob1 = new HouseRob(new int[]{2, 3, 4, 5, 3});
        assertEquals(9, houseRob1.run_O1());
    }
} 
