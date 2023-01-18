package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* PackComplete Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 18, 2023</pre> 
* @version 1.0 
*/ 
public class PackCompleteTest { 

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
        PackComplete packComplete = new PackComplete(
                new Integer[]{1, 3, 4},
                new Integer[]{15, 20, 30},
                4
        );
        assertEquals(new Integer(60), packComplete.run());

        PackComplete packComplete1 = new PackComplete(
                new Integer[]{2, 1},
                new Integer[]{2, 5},
                10
        );
        assertEquals(new Integer(50), packComplete1.run());

        PackComplete packComplete2 = new PackComplete(
                new Integer[]{3, 2},
                new Integer[]{20, 15},
                5
        );
        assertEquals(new Integer(35), packComplete2.run());
    }


} 
