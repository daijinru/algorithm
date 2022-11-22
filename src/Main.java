import binaryTree.BinaryTree;
import binaryTree.BinaryTreePosOrderRecur;
import binaryTree.BinaryTreePreOrderRecur;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        runBinaryTreePreOrderRecur();
        runBinaryTreePosOrderRecur();
    }

    public static void runBinaryTreePreOrderRecur() {
        BinaryTreePreOrderRecur binaryTreePreOrderRecur = new BinaryTreePreOrderRecur();
        BinaryTree.Node node = binaryTreePreOrderRecur.ready();
        binaryTreePreOrderRecur.run(node);
    }

    public static void runBinaryTreePosOrderRecur() {
        BinaryTreePosOrderRecur binaryTreePosOrderRecur = new BinaryTreePosOrderRecur();
        BinaryTree.Node node = binaryTreePosOrderRecur.ready();
        binaryTreePosOrderRecur.run(node);
    }
}