
public class CurrentDate {
  public static void main(String[] args) {
    java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
    System.out.println(date);
  }
}
