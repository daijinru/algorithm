package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/** 
* Bag01 Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 17, 2023</pre> 
* @version 1.0 
*/ 
public class Pack01Test {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: run() 
* 
*/ 
    @Test
    public void testRun() throws Exception {
        Pack01 bag01 = new Pack01(
                new Integer[]{1, 3, 4},
                new Integer[]{15, 20, 30},
                4
        );
        assertEquals(new Integer(35), bag01.run());

        Pack01 bag02 = new Pack01(
                new Integer[]{1, 3, 4},
                new Integer[]{15, 20, 30},
                7
        );
        assertEquals(new Integer(50), bag02.run());

        Pack01 bag03 = new Pack01(
                new Integer[]{1, 3, 4},
                new Integer[]{15, 20, 30},
                3
        );
        assertEquals(new Integer(20), bag03.run());
    }

} 
