package home.trial.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
  public static void main(String[] args) {
    String str = "abacdacbc";
    char[] c = str.toCharArray();
    Map map = new HashMap();
    for(char character : c){
      Integer count = (Integer) map.get(character);
      if(count == null){
        map.put(character, 1);
      }else{
        map.put(character, count+1);
      }
    }
    for(Object key: map.keySet()){
      System.out.println("The char " +key + " count in the given string is "+(Integer)map.get(key));
    }
  }
}
