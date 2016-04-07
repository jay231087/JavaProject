public class ArraysSetZeros {
  public static void main(String[] args) throws java.lang.Exception {
    int m[][] = { { 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
    System.out.println("---------------- Output Matrix ---------");
    setZeros(m);
    printMat(m);
  }

  public static void printMat(int[][] mat) {
    int rows = mat.length;
    int cols = mat[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(" " + mat[i][j]);
      }
      System.out.println(" ");
    }
  }

  public static void setZeros(int m[][]) {
    boolean zeroRow[] = new boolean[m.length];
    boolean zeroCol[] = new boolean[m[0].length];
    for (int row = 0; row < m.length; row++) {
      // if this row is a zero row, skip it
      if (zeroRow[row]) {
        continue;
      }
      for (int col = 0; col < m[0].length; col++) {
        // if this col is a zero row or col skip it
        if (zeroRow[row] || zeroCol[col]) {
          continue;
        }
        // if we are here, then let's check the element value
        if (m[row][col] == 0) {
          zeroRow[row] = true;
          zeroCol[col] = true;
          // make all elements in the above row,col zero
          // row elements
          for (int i = 0; i < m[0].length; i++) {
            m[row][i] = 0;
          }
          // col elements
          for (int i = 0; i < m.length; i++) {
            m[i][col] = 0;
          }
        }
      }
    }
  }
}
