package binaryTree;

/**
 * Serialize and deserialize the binary-tree by Preorder Traversal.
 */
public class Deserialize extends BinaryTree<TreeNode<Integer>, TreeNode<Integer>>{
    public String in;
    public String space;
    public Deserialize(String in, String space) {
        this.in = in;
        this.space = space;
    }
    @Override
    public TreeNode<Integer> run() {
        String[] nodeStrs = this.in.split(",");
        int[] i = new int[]{0};

        return recursive(nodeStrs, i);
    }

    public TreeNode<Integer> recursive(String[] strs, int[] i) {
        String str = strs[i[0]];
        i[0]++;
        if (str.equals(this.space)) {
            return null;
        }

        TreeNode<Integer> treeNode = new TreeNode<>(Integer.valueOf(str));
        return this.DFS(strs, i).execute(treeNode);
    }

    @Override
    public DFS<TreeNode<Integer>> DFS(Object... args) {
        return (TreeNode<Integer> node) -> {
            int[] i = (int[])args[1];
            String[] strs = (String[])args[0];
            node.left = this.recursive(strs, i);
            node.right = this.recursive(strs, i);
            return node;
        };
    }

    public static String serialize(TreeNode<Integer> node, String space) {
        if (node == null) return space;
        String leftStr = serialize(node.left, space);
        String rightStr = serialize(node.right, space);
        return String.valueOf(node.val) + "," + leftStr + "," + rightStr;
    }
}