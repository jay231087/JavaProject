package home.trial.ds;
public class CheckIfTwoNode2sAreCousins {
  public boolean areCousins(Node2 root, Node2 x, Node2 y) {
    // get the heights of both the Node2s and return false if heights ate not
    // same

    if (getHeight(root, x, 1) != getHeight(root, y, 1))
      return false;
    else {
      // Now check if or not parents are same for both the Node2, if not ,
      // return true
      if (sameParents(root, x, y) == false) {
        return true;
      } else {
        return false;
      }
    }
  }
  public int getHeight(Node2 root, Node2 x, int height) {
    if (root == null)
      return 0;
    if (root == x)
      return height;

    int level = getHeight(root.left, x, height + 1);
    if (level != 0)
      return level;
    return getHeight(root.right, x, height + 1);
  }

  public boolean sameParents(Node2 root, Node2 x, Node2 y) {
    if (root == null)
      return false;
    return ((root.left == x && root.right == y)
        || (root.left == y && root.right == x)
        || sameParents(root.left, x, y) || sameParents(root.right, x, y));
  }

  public static void main(String[] args) throws java.lang.Exception {
    Node2 root = new Node2(1);
    Node2 x1 = new Node2(2);
    Node2 y1 = new Node2(3);
    root.left = x1;
    root.right = y1;
    root.left.left = new Node2(4);
    root.right.left = new Node2(6);
    Node2 x2 = new Node2(7);
    Node2 y2 = new Node2(9);
    root.right.left.left = new Node2(8);
    root.right.left.right = y2;
    root.left.left.left = x2;

    CheckIfTwoNode2sAreCousins i = new CheckIfTwoNode2sAreCousins();
    System.out.println("Node2 " + x1.data + " and Node2 " + y1.data + " are cousins??? " + i.areCousins(root, x1, y1));
    System.out.println("Node2 " + x2.data + " and Node2 " + y2.data + " are cousins??? " + i.areCousins(root, x2, y2));
  }
}

class Node2 {
  int data;
  Node2 left;
  Node2 right;

  public Node2(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}