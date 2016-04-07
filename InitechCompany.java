package home.trial.ds;

import java.util.List;

class MyNode {
  protected int data;
  public List<MyNode> chidren;

  MyNode() {
    super();
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public List<MyNode> getChidren() {
    return chidren;
  }

  public void setChidren(List<MyNode> chidren) {
    this.chidren = chidren;
  }
}

public class InitechCompany {
  @SuppressWarnings("unused")
  private static MyNode lca(MyNode node, MyNode nodeA, MyNode nodeB) {
    if (node == null)
      return null;
    if (node.data == nodeA.data || node.data == nodeB.data)
      return node;

    List<MyNode> children = node.chidren;
    int count = 0;
    MyNode lca = null;
    for (MyNode n : children) {
      MyNode tmpNode = lca(n, nodeA, nodeB);

      if (tmpNode != null) {
        lca = tmpNode;
        count++;
      }
    }
    if (count == 2) {
      return node;
    }
    return lca;
  }
}
