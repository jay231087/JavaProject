public class AB {
  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread();
    t.start();
    System.out.print("X");
    synchronized (t) {
      t.wait();
    }
    System.out.print("Y");
  }
}