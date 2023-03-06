package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal extends BinaryTree<TreeNode<Integer>, List<Integer>>{
    public TreeNode<Integer> node;
    public InorderTraversal(TreeNode<Integer> node) {
        this.node = node;
    }

    @Override
    public List<Integer> run() {
        List<Integer> record = new ArrayList<>();
        this.recursive(this.node, record);
        return record;
    }

    public void recursive(TreeNode<Integer> node, List<Integer> record) {
        this.DFS(record).execute(node);
    }

    @Override
    public DFS<TreeNode<Integer>> DFS(Object... args) {
        return (TreeNode<Integer> node) -> {
            if (node != null) {
                List<Integer> record = (List<Integer>)args[0];
                recursive(node.left, record);
                record.add(node.val);
                recursive(node.right, record);
            }
            return null;
        };
    }
}
