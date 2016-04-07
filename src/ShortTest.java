package home.trial.ds;

import java.util.HashSet;
import java.util.Set;

public class ShortTest {
  public static void main(String[] args) {
    Set<Short> set = new HashSet<Short>();
    
    for(short i=0;i<10;i++){
      set.add(i);
      set.remove(i-1);
    }
    System.out.println(set.size());
  }
}
