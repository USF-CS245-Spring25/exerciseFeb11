public class BinarySearchTreeExample {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.iterativeInsert(6);
        tree.iterativeInsert(1);
        tree.iterativeInsert(10);
        tree.iterativeInsert(8);
        tree.iterativeInsert(12);
        tree.iterativeInsert(16);
        tree.printPreorder();
        System.out.println();
        System.out.println(tree.findIterative(12));
        System.out.println(tree.getLargestIterative());
        System.out.println(tree.getLargest());

    }
}
