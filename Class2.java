package home.trial.ds;

public class Class2{
  public static void main(String[] args) {
    String names[] = {"1","2","3"};
    Class1.main(names);
  }
}

class Class1 {
  public static void main(String[] args) {
    for(String str : args){
      System.out.println("4 --->"+ str);
    }
  }
}
