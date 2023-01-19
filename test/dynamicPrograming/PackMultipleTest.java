package dynamicPrograming;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

/** 
* PackMultiple Tester. 
* 
* @author <Authors name> 
* @since <pre>1ÔÂ 19, 2023</pre> 
* @version 1.0 
*/ 
public class PackMultipleTest { 

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
        PackMultiple packMultiple = new PackMultiple(
                new Integer[]{1, 3, 4},
                new Integer[]{15, 20, 30},
                new Integer[]{2, 3, 2},
                5
        );
        assertEquals(new Integer(50), packMultiple.run());
    }
}
