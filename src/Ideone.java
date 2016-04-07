/* package whatever; // don't place package name! */
 
/* Name of the class has to be "Main" only if the class is public. */
 
/**
 * 
 * TODO: DEFINE ME!! rrathi
 * 
 * @author rrathi
 * @date 16-Jan-2016
 *
 */
class Ideone {
  public static void killAllOne(int[][] mat) {
 
    boolean isFirstColZero = false;
    boolean isFirstRowZero = false;
 
    int rows = mat.length;
    int cols = mat[0].length;
 
    for (int i = 0; i < rows; i++) {
      if (mat[i][0] == 0) {
        isFirstRowZero = true;
      }
    }
 
    for (int j = 0; j < cols; j++) {
      if (mat[0][j] == 0) {
        isFirstColZero = true;
      }
    }
 
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        if (mat[i][j] == 0) {
          mat[i][0] = 0;
          mat[0][j] = 0;
        }
      }
    }
 
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        if (mat[i][0] == 0 || mat[0][j] == 0) {
          mat[i][j] = 0;
        }
      }
    }
    if (isFirstRowZero) {
      for (int j = 0; j < cols; j++) {
        mat[0][j] = 0;
      }
    }
 
    if (isFirstColZero) {
      for (int i = 0; i < rows; i++) {
        mat[i][0] = 0;
      }
    }
 
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
 
  public static void main(String[] args) throws java.lang.Exception {
    int mat[][] = { { 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }
 
    };
    System.out.println("-------------- Input Matrix ---------");
    printMat(mat);
 
    killAllOne(mat);
    System.out.println("---------------- Output Matrix ---------");
    printMat(mat);
  }
}