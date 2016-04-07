import java.util.LinkedList;

public class SwapLL {
  public LinkedList<Integer> swapLinkedList(LinkedList<Integer> inputLinkedList) {
    LinkedList<Integer> outputLinkedList = new LinkedList<Integer>();
    for (int i = 1; i <= inputLinkedList.size(); i++) {
      if (i % 2 != 0) {
        outputLinkedList.add(inputLinkedList.get(i));
        outputLinkedList.add(inputLinkedList.get(i - 1));
      }
    }
    return outputLinkedList;
  }
}

class testSwapLL {
  public static void main(String[] args) {
    SwapLL swapLL = new SwapLL();
    LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
    inputLinkedList.add(5);
    inputLinkedList.add(13);
    inputLinkedList.add(15);
    inputLinkedList.add(18);
    inputLinkedList.add(20);
    inputLinkedList.add(11);
    inputLinkedList.add(6);
    inputLinkedList.add(7);
    LinkedList<Integer> outputLinkedList = swapLL.swapLinkedList(inputLinkedList);
    for (int i = 0; i < outputLinkedList.size(); i++) {
      System.out.println(outputLinkedList.get(i));
    }
  }
}
