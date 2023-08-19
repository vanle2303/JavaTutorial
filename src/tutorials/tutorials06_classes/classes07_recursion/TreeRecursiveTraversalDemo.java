package tutorials.tutorials06_classes.classes07_recursion;

public class TreeRecursiveTraversalDemo {
    public static void main(String[] args) {
        //here in order to call method "travelRecursively..."
        // we need to create an object of type TreeRecursiveDemo
        TreeRecursiveTraversalDemo treeRecursiveTraversalDemo = new TreeRecursiveTraversalDemo();

        // Method "travelRecursively..." needs to be passed an arg of type Node
        // we then create a var of type Node named "root" and pass it to the calls below
        Node root = treeRecursiveTraversalDemo.createBinaryTree();
        treeRecursiveTraversalDemo.travelATreeRecursivelyPreOrder(root);
        System.out.println();
        treeRecursiveTraversalDemo.travelATreeRecursivelyInOrder(root);
        System.out.println();
        treeRecursiveTraversalDemo.travelATreeRecursivelyPostOrder(root);

    }

    /**
     * This method creates a tree.
     * Specifically, it creates 7 nodes and sets the children for each node.
     * For example, node1 has node2 and node3 as its children.
     * In order to return the tree, we just need to return the root node, which is node1
     * Note that we hard-coded everything including the nodes' values and the children
     * In real-world application, we would need some params from a func to create a tree
     *
     * @return
     */
    public Node createBinaryTree() {
        //create new nodes of the Note type
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        //now, we have 7 nodes just created above, but they don't have anything to do with eo
        //we then link them together using setters method
        //after this step, node1 has its left-child (node2) and its right-child (node3). Similarly with other nodes
        node1.setLeftChild(node2);
        node1.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node3.setLeftChild(node6);
        node5.setLeftChild(node7);

        //in order to get all the nodes of a tree, we only need to get the root of that tree
        //we then get all the children of the root recursively
        return node1;
    }


    /**
     * Given a root node of a tree, travel the tree recursively to print all the nodes of the tree
     * Pre-Order Traversal
     * For example, now we have a tree below and we want to print out all the nodes of the tree in Pre-Order
     *              1
     *          |       |
     *          2       3
     *       |    |    |
     *      4    5     6
     *         |
     *         7
     * The rule of printing the nodes in Pre-Order is as follows
     * First, we have to print the parent, then print the children: Root -> Left-child -> Right-child
     * Similarly and recursively, if the left-child has grandchildren, we have to print the left-child first
     * before printing the grandchildren.
     * NOTE: As for the order of printing of the 2 children of the same parent, u can choose to print
     * the left or the right child first. It doesnt matter but be consistent with your choice.
     * For example, for the tree above,
     *      a, root node is 1, so we print 1
     *      b, then we process the left-child 2
     *          b1, we print 2
     *          b2, we print 4
     *          b3, we print 5
     *          b4, we print 7
     *      c, we process the right-child of 1, which is 3
     *          c1, we print 3
     *          c2, we print 6
     * Result: 1 2 4 5 7 3 6
     * @param root
     */
    void travelATreeRecursivelyPreOrder(Node root) {
        System.out.print(root.getValue() + "  ");

        if (root.getLeftChild() != null) {
            travelATreeRecursivelyPreOrder(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            travelATreeRecursivelyPreOrder(root.getRightChild());
        }

        //this is not needed bc if we dont call the return statement explicitly like this
        //it will return anyway bc it has reached the end of the func and we make no further recursive call
        /*if (root.getLeftChild() == null && root.getRightChild() == null) {
            return;
        }*/
    }

    /**
     * In-order Traversal
     * The rule of printing the nodes in In-Order is as follows
     * First, we print LeftChild -> Parent -> RightChild
     * Similarly and recursively, if the left-child has grandchildren, we have to print the left grandchild first
     * before printing the left-child, we then print out the right grandchild
     * Same note abt the left and right children as in Pre-order section
     * For example, this method works as follows
     *      1,Root node is 1, so we need to print 2 first
     *          1.1. In order to print 2, we need to print 2.leftChild.
     *              a, So we need to print 4 first
     *                      Since 4 doesnt have any children -> Print (4)
     *          1.2. 2.leftChild is done -> Print(2)
     *          1.3. Now we work with 2.rightChild, which is 5
     *              a, Since 5 has a left-child, in order to print 5, work with 5.leftChild (7) first
     *                     7 doesnt have any children -> Print (7)
     *              b, 5.leftChild is done -> Print(5)
     *          1.4. Now, 1.leftChild is done -> Print 1
     *          1.5 we have done with 1.leftChild --> 1
     *              we are abt to work with 1.rightChild, which is similar to the left-child
     * Result: 4 2 7 5 1 6 3
     * @param root
     */
    void travelATreeRecursivelyInOrder(Node root) {
        if (root.getLeftChild() != null) {
            travelATreeRecursivelyInOrder(root.getLeftChild());
        }
        System.out.print(root.getValue() + "  ");
        if (root.getRightChild() != null) {
            travelATreeRecursivelyInOrder(root.getRightChild());
        }

    }

    /**
     * Post-order Traversal
     * The rule of printing the nodes in Post-Order is as follows
     * We print Left-child -> Right-child -> Parent
     * Similarly and recursively, if the left-child has grandchildren,
     * we have to print left grandchild -> right grandchild -> Left-child
     * before printing the Right-child, then printing the Parent
     * Same note abt the left and right children as in Pre-order section
     * For example, this is how Post-order works specifically
     * 1. Root node is 1, then we need to print 1's left and right children first
     *      a, 1.leftChild is 2. In order to print 2, we need to work with
     *          a.1, 2.leftChild, which is 4
     *              Since 4 doesnt have any children -> Print(4)
     *          a.2, 2.RightChild, which is 5
     *              Since 5 has a left-child which is 7
     *                  -> Print (7)
     *              then -> Print(5)
     *          We have done with 2.leftChild and 2.rightChild -> Print(2)
     *      b, 1.rightChild, which is similar to 1.leftChild
     * Result: 4 7 5 2 6 3 1
     * @param root
     */
    void travelATreeRecursivelyPostOrder(Node root) {
        if (root.getLeftChild() != null) {
            travelATreeRecursivelyPostOrder(root.getLeftChild());
        }
        if (root.getRightChild() != null) {
            travelATreeRecursivelyPostOrder(root.getRightChild());
        }
        System.out.print(root.getValue() + "  ");
    }

    /**
     * This class demos a data structure called "tree".
     * a tree consists of many nodes. A node has a value (or an ID) and each node has a left-child or a right-child or both of them or none of them
     * a node with no parent is a "root" and a node with no children is a "leaf"
     * If we have access to the root, we can access all of its children and grandchildren recursively.
     */
    class Node {
        //here we create instance vars of class Node
        private int value;
        private Node leftChild;  // leftChild and rightChild must be Node type instead of int
        private Node rightChild; // since they also have their children

        /**
         * create a constructor for instance var "value"
         *
         * @param value
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * a getter to get the root value
         *
         * @return
         */
        public int getValue() {
            return value;
        }

        /**
         * create setter to set the value of leftChild and rightChild
         *
         * @param leftChild
         */
        void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        /**
         * create a getter to get the value of leftChild and rightChild
         *
         * @return
         */
        Node getLeftChild() {
            return leftChild;
        }

        Node getRightChild() {
            return rightChild;
        }
    }
}


