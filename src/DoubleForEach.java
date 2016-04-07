package home.trial.ds;

public class DoubleForEach {
  public static void main(String[] args) {
    int []arr ={1,2,3};
    for(int element:arr){
      System.out.println(element);
      element = element +5; 
    }
    for(int element:arr){
      System.out.println(element);
    }
  }
}
