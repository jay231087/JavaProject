package home.trial.ds;

public class SeparateZeroAndOne {
  public static final int[] a = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

  public static void main(String[] args) {
    if (a.length > 0) {
      int left = 0;
      int right = a.length - 1;
      while (left < right) {
        while (a[left] == 0 && left < right) {
          left++;
        }
        while (a[right] == 1 && left < right) {
          right--;
        }
        if (left < right) {
          a[left] = 0;
          a[right] = 1;
          left++;
          right--;
        }
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
