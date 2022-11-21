public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        runBinaryTreePreOrderRecur();
    }

    public static void runBinaryTreePreOrderRecur() {
        BinaryTreePreOrderRecur binaryTreePreOrderRecur = new BinaryTreePreOrderRecur();
        BinaryTreeContruct.Node node = binaryTreePreOrderRecur.ready();
        binaryTreePreOrderRecur.run(node);
    }
}