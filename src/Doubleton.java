public class Doubleton {
  private static final Doubleton[] doubleTon = { new Doubleton(), new Doubleton() };
  private static int index = 0;

  private Doubleton() {
  }

  public static Doubleton getInstance() {
    synchronized (doubleTon) {
      return doubleTon[index++ % 2];
    }
  }

}