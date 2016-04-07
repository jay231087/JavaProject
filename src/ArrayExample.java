public class ArrayExample {
  public void arrayStoreException() {
    Object a[] = new Integer[5];
    for (int i = 0; i < 6; i++) {
      a[i] = "string";
    }
  }

  public void negativeArraySizeException() {
    Object a[] = new Integer[-5];
  }
}
