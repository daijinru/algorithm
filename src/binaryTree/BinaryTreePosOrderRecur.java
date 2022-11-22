package binaryTree;

/**
 * Postorder Traversal (LRD)
 * When counting the size of a folder, should traverse the size of its files at first.
 * A folder size is the sum of the sizes of its all sub folders.
 */
public class BinaryTreePosOrderRecur {

    public BinaryTree.Node ready() {
        return new BinaryTree().build();
    }

    public void run(BinaryTree.Node node) {
        if (node == null) {
            return;
        }

        run(node.left);
        run(node.right);
        System.out.println(node.value);
    }
}
