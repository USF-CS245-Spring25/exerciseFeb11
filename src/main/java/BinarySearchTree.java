class BinarySearchTree {

    /** An inner class representing a node in a BST tree */
    private class BSTNode {
        int data; // value at the node
        BSTNode left; // left child
        BSTNode right; // right child

        BSTNode(int newdata) {
            data = newdata;
        }
    } // end of class BSTNode

    private BSTNode root; // the root of the tree

    /**
     * Constructor
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Find a given element in the tree.
     * @param elem element to search for
     * @return true if found the element, false otherwise
     */
    public boolean findIterative(int elem) {
        BSTNode current = root;
        while (current != null) {
            if (elem == current.data)
                return true;
            else if (elem < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }


    /**
     * The recursive implementation of the find method. Calls the private method.
     * @param elem element to search for
     * @return true if found the element, false otherwise
     */
    public boolean findRecursive(int elem) {
        return findRecursive(elem, this.root);
    }

    /**
     * The recursive implementation of the find method
     * @param elem element to search for
     * @param root root of the tree in which to search
     * @return true if found the element, false otherwise
     */
    private boolean findRecursive(int elem, BSTNode root) {
        if (root == null)
            return false;
        // FILL IN CODE :

        return false;
    }

    /**
     * Insert an element in the BST (iterative)
     * @param elem value to insert
     */
    public void iterativeInsert(int elem) {
        BSTNode prev = null; // need to keep track of the node to which we will be attaching the new node
        BSTNode current = root;
        if (root == null) {
            root = new BSTNode(elem);
            return;
        }
       // while (current != null) {
            // FILL IN CODE:

        //}
    }

    /** Return the largest value in the BST. Must be efficient.
     *
     * @return largest value
     */
    public int getLargestIterative() {
        BSTNode curr = root;
        if (curr == null)
            throw new IllegalArgumentException();
        // FILL IN CODE: iterative implementation of getLargest


        return 0; //change
    }

    /**
     * Get the largest node in the BST - calls a private recursive method
     * @return largest value in BST
     */
    public int getLargest() {
        return getLargest(root);
    }

    private int getLargest(BSTNode root) {
        // FILL IN CODE: recursive implementation of getLargest

        return 0; // change
    }

    /** Print a binary tree (preorder) */
    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(BSTNode root) {
        if (root != null) {
            System.out.print(" " + root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }
}
