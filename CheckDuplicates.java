package home.trial.ds;

public class CheckDuplicates {
  
  public static void main(String[] args) {
    int A [] = {3,2,1,2,2,3};
    for(int i = 0; i<A.length ;i++){
      if(A[Math.abs(A[i])]<0){
        System.out.println("We found the duplicate and the duplicate number is "+A[i]);
      }else{
        if(A[i] < 0){
          A[Math.abs(A[i])] = - A[Math.abs(A[i])];
        }else{
          A[A[i]] = - A[A[i]]; 
        }
      }
    }
  }
}
