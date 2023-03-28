package binaryTree;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/** 
* MaxDepth Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 28, 2023</pre> 
* @version 1.0 
*/ 
public class MaxDepthTest { 
    public TreeNode<Integer> deserialize;
    @Before
    public void before() throws Exception {
        String in = "1,2,#,#,4,5,#,#,3,6,#,#,7,#,#";
        Deserialize deserialize = new Deserialize(in, "#");
        this.deserialize = deserialize.run();
    }

    @Test
    public void testRun() throws Exception {
        MaxDepth md = new MaxDepth(this.deserialize);
        assertEquals(4, md.run());
    }
} 
