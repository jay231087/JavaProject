package home.trial.ds;

public class NumberOfTrailingZerosInNumberFactorial {
  
  public static final int n = 5;
  public static void main(String[] args) {
    int i,count =0;
    if(n<0){
      return;
    }
    for(i =5;n/i>0;i*=5){
      count += n/i;
    }
    System.out.println(count);
  }
}
