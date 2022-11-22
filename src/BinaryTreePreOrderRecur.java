public class BinaryTreePreOrderRecur {

    public BinaryTree.Node ready() {
        BinaryTree binaryTree = new BinaryTree();
        return binaryTree.build();
    }

    public void run(BinaryTree.Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        run(node.left);
        run(node.right);
    }

}
