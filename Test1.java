package home.trial.ds;

public class Test1 {
  public static void main(String args[]) {
    String s2 = "String hash code is same";
    String s1 = new String("String hash code is same");
    String s3 = "String hash code is same";
    if (s2.hashCode() == s1.hashCode()) {
      System.out.println("Yes ");
    } else {
      System.out.println("No");
    }
    if (s1.equals(s3)) {
      System.out.println("Yes ");
    } else {
      System.out.println("No");
    }
  }

}
