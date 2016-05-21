import java.util.HashMap;
import java.util.Map;

public class Solution1 {
  public static int problemSolution(int []arr, String range){
    int rangeFound =0;
    Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
    populateMyMap(arr, myMap);
    rangeFound = validateRange(range, rangeFound, myMap);
    return rangeFound;
  }

  private static int validateRange(String range, int rangeFound, Map<Integer, Integer> myMap) {
    if(range !=null){
      String strArr[] = range.split("-");
      int startIndex = Integer.parseInt(strArr[0]);
      int endIndex = Integer.parseInt(strArr[1]);
      if(startIndex > endIndex){
        int temp = startIndex;
        startIndex = endIndex;
        endIndex = temp;
      }
      rangeFound = traverseThroughRange(rangeFound, myMap, startIndex, endIndex);
    }
    return rangeFound;
  }

  private static int traverseThroughRange(int rangeFound, Map<Integer, Integer> myMap, int startIndex, int endIndex) {
    for(int j = endIndex; j>=startIndex; j--){
      rangeFound = 0;
      if(myMap.containsKey(j)){
        rangeFound = 1;
      }else{
        rangeFound = 0;
        break;
      }
    }
    return rangeFound;
  }

  private static void populateMyMap(int[] arr, Map<Integer, Integer> myMap) {
    for(int i =0; i< arr.length ;i++){
      if(!myMap.containsKey(arr[i])){
        myMap.put(arr[i], 1);
      }else{
        myMap.put(arr[i], myMap.get(arr[i])+1);
      }
    }
  }
}

class testClass{
  
  public static void main(String[] args) {
    Solution1 solution1 = new Solution1();
    int []arr = {1,2,8,6,7,5,12};
    int rangeFound = solution1.problemSolution(arr, "6-8");
    System.out.println(rangeFound);
  }
}
