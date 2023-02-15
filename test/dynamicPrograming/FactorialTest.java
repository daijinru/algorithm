package dynamicPrograming;

import org.junit.Test;
import utils.ArrayUtil;
import static org.junit.Assert.*;

/** 
* Factorial Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 15, 2023</pre> 
* @version 1.0 
*/ 
public class FactorialTest {

    @Test
    public void testRun() throws Exception {
        int[] input = new int[]{1, 2, 3, 4, 5};
        Factorial f = new Factorial(ArrayUtil.IntsToIntegers(input));
        assertEquals(120, f.run());

        int[] input2 = new int[]{1};
        Factorial f2 = new Factorial(ArrayUtil.IntsToIntegers(input2));
        assertEquals(1, f2.run());
    }
} 
