package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/** 
* MinCostClimbingStairs Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 1, 2023</pre> 
* @version 1.0 
*/ 
public class MinCostClimbingStairsTest {
    @Test
    public void testRun() throws Exception {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs(new int[]{1, 100, 1, 1, 100, 1});
        assertEquals(4, minCostClimbingStairs.run());
    }


    @Test
    public void testRunDP() throws Exception {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs(new int[]{1, 100, 1, 1, 100, 1});
        assertEquals(4, minCostClimbingStairs.runDP());
    }

    @Test
    public void testRunDpOn() throws Exception {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs(new int[]{1, 100, 1, 1, 100, 1});
        assertEquals(4, minCostClimbingStairs.runDpOn());
    }

} 
