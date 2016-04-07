package home.trial.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumDifference {
  public static void main(String[] args) {
    Object [] a = {2, 3, 10, 6, 4, 8, 1};
    MaximumDifferenceTest maxDiff = new MaximumDifferenceTest();
    maxDiff.check(a);
  }
}

class MaximumDifferenceTest {
  Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer,Map<Integer,Integer>>();
  Integer k =0;
  public void check(Object[] a){
    Integer x = (Integer) a[0];
    Set<Object> mySet = new HashSet<Object>();   
    for (Integer i = 0; i < a.length; i++) {    
      mySet.add(a[i]);
      if (i == 0) {
        continue;
      }
      Integer y = (Integer) a[i];
      if ((y > x) && (y-x > k)) {
        k = y-x;
        map.clear();
        Map<Integer,Integer> newMap = new HashMap<Integer,Integer>();
        newMap.put(x, y);
        map.put(k,newMap);
      }
      if (i == a.length - 1) {
        mySet.remove(a[0]);
        a = (Object[]) mySet.toArray();
        if(a.length>1){
          check(a);
        }
      }
    }
    for(Object key: map.keySet()){
      System.out.println("("+key+")");
    }
  }
}
