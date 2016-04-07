package home.trial.ds;

public class StringImutablePractical implements Runnable {
  String test;

  StringImutablePractical(String test) {
    this.test = test;
    Thread t = new Thread(this);
    t.start();
  }

  public void run() {
    test = "changed";
    System.out.println(" in therad " + test);
  }

  static void change(String y) {
    y = "changed";
    System.out.println("in method " + y);
  }

  public static void main(String k[]) {
    String test = "origial";
    System.out.println("in main " + test);
    change(test);
    System.out.println("in main " + test);
    new StringImutablePractical(test);
    try {
      Thread.sleep(10);
    } catch (Exception e) {

    }
    System.out.println(" in main thread " + test);

  }
}