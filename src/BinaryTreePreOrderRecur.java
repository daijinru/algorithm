public class BinaryTreePreOrderRecur {

    public BinaryTreeContruct.Node ready() {
        BinaryTreeContruct binaryTreeContruct = new BinaryTreeContruct();
        return binaryTreeContruct.build();
    }

    public void run(BinaryTreeContruct.Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);
        run(node.left);
        run(node.right);
    }

}
