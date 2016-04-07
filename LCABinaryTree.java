
public class LCABinaryTree {
  public static void main(String args[]) {
    /**
     * Create a sample Binary Tree. A Binary tree does not have to maintain
     * left <root < right relationship.
     */
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(4);
    root.left.left = new Node(6);
    root.left.right = new Node(5);

    root.right.left = new Node(9);
    root.right.right = new Node(11);
    root.right.right.left = new Node(7);
    root.right.right.right = new Node(3);

    System.out.println("Lowest Common Ancestor of Node 3 and 9 is: "
            + BinaryTree.findLowestCommonAncestor(root, root.right.right.right, root.right.left).value);
     
    System.out.println("Lowest Common Ancestor of Node 3 and null is: "
            + BinaryTree.findLowestCommonAncestor(root, root.right.right.right, null).value);
     
    System.out.println("Lowest Common Ancestor of Node 11 and null is: "
            + BinaryTree.findLowestCommonAncestor(root, root.right.right, null).value);

}
}
