package home.trial.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TestArray1 {
  public static void main(String[] args) {
    int k =3;
    Object [] a ={1,2,4,-1,5,6,-2};
    Array1 arr = new Array1();
    Map<Object,Object> map = arr.check(a, k);
    for(Object key: map.keySet()){
      System.out.println("("+key+","+map.get(key)+")");
    }
  }
}

public class Array1 {
  Map<Object,Object> map = new HashMap<Object,Object>();
  public Map<Object,Object> check(Object[] a, int k) {
    Integer x = (Integer) a[0];
    Set<Object> mySet = new HashSet<Object>();
    for (Integer i = 0; i < a.length; i++) {    
      mySet.add(a[i]);
      if (i == 0) {
        continue;
      }
      Integer y = (Integer) a[i];
      if (y == k - x) {
        map.put(x, y);
      }
      if (i == a.length - 1) {
        mySet.remove(a[0]);
        a = (Object[]) mySet.toArray();
        if(a.length>1){
          map = check(a, k);
        }
      }
    }
    return map;
  } 
}
