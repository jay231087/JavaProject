package home.trial.ds;

public class StringTest {
  static String str;
  public static boolean test1(){
    return new Boolean("1");
  }
  public static boolean test2(){
    return new Boolean(str);
  }
  public static void main(String[] args) {
    if(test1()){
      System.out.println("1");
    }
    if(!test2()){
      System.out.println("2");
    }
    if(test1() != test2()){
      System.out.println("3");
    }
  }
}
