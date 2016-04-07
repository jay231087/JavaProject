/**
 * Binary Tree representation.
 */
public class BinaryTree {
  Node left;
  Node right;
  int value;
  public Node getLeft() {
    return left;
  }
  public void setLeft(Node left) {
    this.left = left;
  }
  public Node getRight() {
    return right;
  }
  public void setRight(Node right) {
    this.right = right;
  }
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  
  /**
   * Recursive approach to find the Lowest Common Ancestor
   * @param root
   * @param a - first Node
   * @param b - second Node
   * @return Node that is lowest common ancestor of both a and b
   */
  public static Node findLowestCommonAncestor(Node root, Node a, Node b) {
      
    Node left = null;
    Node right = null;

    if (root == null) {
       return null;
    }

    /**
     * If Node a or Node b is also the root, then the root itself is lowest common ancestor
    */
    if (root == a || root == b) {
       return root;
    }

    left = findLowestCommonAncestor(root.left, a, b);
    right = findLowestCommonAncestor(root.right, a, b);

    /**
     * If Node a and Node b lie in the left, their Lowest Common Ancestor is in the left.
     * If Node a and Node b lie in the right,their Lowest Common Ancestor is in the right.
     *
     * Otherwise, root is the Lowest common ancestor.
    */
    if (left != null && right != null) {
       return root;
    }

    return (left != null) ? left : right;
  }
}
