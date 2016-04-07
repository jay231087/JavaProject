public class KadeneAlgorithm { 
  public static void main(String[] args) {
    final int []arr = {-2, -3, 4, 25, -1, -2, 1, 5, -3};
    int max_so_far = arr[0];
    int max_end_val = arr[0];
    for(int i=1; i<arr.length; i++){
      if(max_end_val < 0){
        max_end_val = arr[i];
      }else{
        max_end_val +=arr[i];
      }
      if(max_end_val >= max_so_far){
        max_so_far = max_end_val;
      }
    }
    System.out.println(max_so_far);
    System.out.println(max_end_val);
  }
}
