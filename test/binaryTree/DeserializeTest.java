package binaryTree;

import org.junit.Test; 

/** 
* Deserialize Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 3, 2023</pre> 
* @version 1.0 
*/ 
public class DeserializeTest {

/** 
* 
* Method: run() 
* 
*/ 
    @Test
    public void testRun() throws Exception {
        Deserialize deserialize = new Deserialize("6,6,#,#,6,6,#,#,6,#,#");
        System.out.println(deserialize.run().toString());
    }
} 
