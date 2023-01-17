package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* CanPartition Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 10, 2023</pre> 
* @version 1.0 
*/ 
public class CanPartitionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testRun() throws Exception { 
    Integer[] test = new Integer[]{1, 2, 3, 5};
    CanPartition canPartition = new CanPartition(test);
    assertFalse(canPartition.run());

    Integer[] test2 = new Integer[]{3, 4, 1};
    CanPartition canPartition1 = new CanPartition(test2);
    assertTrue(canPartition1.run());

    Integer[] test3 = new Integer[]{3, 4, 2};
    CanPartition canPartition2 = new CanPartition(test3);
    assertFalse(canPartition2.run());
} 

@Test
public void testSubsetSum() throws Exception {

}


} 
