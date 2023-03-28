package binaryTree;

public class MaxDepth {
    TreeNode<Integer> root;
    public MaxDepth(TreeNode<Integer> in) {
        this.root = in;
    }

    public int run() {
        return this.recursive(this.root);
    }

    public int recursive(TreeNode<Integer> root) {
        if (root == null) return 0;
        int leftDepth = this.recursive(root.left);
        int rightDepth = this.recursive(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
