package binaryTree;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal extends BinaryTree<TreeNode<Integer>, List<Integer>>{
    public TreeNode<Integer> node;
    public PreorderTraversal(TreeNode<Integer> node) {
        this.node = node;
    }
    @Override
    public List<Integer> run() {
        List<Integer> nodes = new LinkedList<>();
        this.recursive(nodes, node);
        return nodes;
    }

    public void recursive(List<Integer> nodes, TreeNode<Integer> node) {
        this.DFS(nodes).execute(node);
    }

    @Override
    public DFS<TreeNode<Integer>> DFS(Object... args) {
        return (TreeNode<Integer> node) -> {
            if (node != null) {
                List<Integer> nodes = (List<Integer>) args[0];
                nodes.add(node.val);
                recursive(nodes, node.left);
                recursive(nodes, node.right);
            }
            return null;
        };
    }
}
