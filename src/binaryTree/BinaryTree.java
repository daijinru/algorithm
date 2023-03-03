package binaryTree;

/**
 * N TreeNode
 * T List(or?) TreeNode
 * R result
 */
public abstract class BinaryTree<T, R> {
    abstract public R run();
    public abstract DFS<TreeNode<Integer>> DFS(Object... args);
}
