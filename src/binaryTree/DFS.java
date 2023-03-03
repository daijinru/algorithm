package binaryTree;

/**
 * T Root TreeNode
 */
@FunctionalInterface
public interface DFS<T> {
    T execute(T node);
}
