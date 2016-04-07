package home.trial.ds;

public class Overloaded {
  
  public static String getValue(Integer value){
    return "String";
  }
  public static String getValue(Object value){
    return "Object";
  }
  
  public static void main(String[] args) {
    System.out.println(getValue(null));
  }
}
