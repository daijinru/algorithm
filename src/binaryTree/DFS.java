package binaryTree;

/**
 * R Root TreeNode
 * S List Contain TreeNodes
 */
@FunctionalInterface
public interface DFS<R, S> {
    void execute(R root, S nodes);
}
