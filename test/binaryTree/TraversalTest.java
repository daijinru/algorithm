package binaryTree;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Before;
import org.junit.Test;
import src.TestBase;
import utils.ArrayUtil;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TraversalTest extends TestBase {
    public TreeNode<Integer> deserialize;
    @Before
    public void before() {
        String in = "1,2,#,#,4,5,#,#,3,6,#,#,7,#,#";
        Deserialize deserialize = new Deserialize(in, "#");

        this.deserialize = deserialize.run();
    }

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testInorder() throws Exception {
        InorderTraversal inorder = new InorderTraversal(this.deserialize);
        List<Integer> expected = Arrays.asList(ArrayUtil.IntsToIntegers(new int[]{2,1,5,4,6,3,7}));
        assertEquals(expected, inorder.run());
    }

    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testPostorder() throws Exception {
        PostorderTraversal postorder = new PostorderTraversal(this.deserialize);
        List<Integer> expected = Arrays.asList(ArrayUtil.IntsToIntegers(new int[]{2,5,6,7,3,4,1}));
        assertEquals(expected, postorder.run());
    }
    @Test
    @BenchmarkOptions(concurrency = 2, warmupRounds = 0, benchmarkRounds = 5)
    public void testPreorder() throws Exception {
        PreorderTraversal preorder = new PreorderTraversal(this.deserialize);
        List<Integer> expected = Arrays.asList(ArrayUtil.IntsToIntegers(new int[]{1,2,4,5,3,6,7}));
        assertEquals(expected, preorder.run());
    }
}
