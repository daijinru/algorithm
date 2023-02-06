package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* HouseRob Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 4, 2023</pre> 
* @version 1.0 
*/ 
public class HouseRobTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: initial() 
* 
*/ 
@Test
public void testInitial() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: STE(int i) 
* 
*/ 
@Test
public void testSTE() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: run() 
* 
*/ 
@Test
public void testRun() throws Exception { 
    HouseRob houseRob = new HouseRob(new int[]{2, 3, 4, 5, 3});
    assertEquals(9, houseRob.run());

    HouseRob houseRob1 = new HouseRob(new int[]{2, 3, 4, 5, 3});
    assertEquals(9, houseRob1.run_O1());
}


} 
