public class Solution2 {
  void swap(List a, List b) {
    if (a == b)
      return;
    if (a.next == b) { // right next to each other
      a.next = b.next;b.prev = a.prev;
      if (a.next != null)
        a.next.prev = a;
      if (b.prev != null)
        b.prev.next = b;
      b.next = a;a.prev = b;
    } else {
      List p = b.prev;List n = b.next;
      b.prev = a.prev;b.next = a.next;a.prev = p;a.next = n;
      if (b.next != null)
        b.next.prev = b;
      if (b.prev != null)
        b.prev.next = b;
      if (a.next != null)
        a.next.prev = a;
      if (a.prev != null)
        a.prev.next = a;
    }
  }
}

class List {
  int key;
  List next, prev;
}