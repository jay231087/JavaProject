import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IDoNotKnowWhatIWillDo {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("a");
    arrayList.add("b");
    ListIterator<String> listIterator = arrayList.listIterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
      listIterator.previous();
    }
  }

}