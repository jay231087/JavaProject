package home.trial.ds;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
  public static void main(String[] args) throws java.lang.Exception {
    int maze[][] = { { 2, 0, 0, 0 }, // the value of start position is irrelevant
        { 1, 1, 1, 1 }, { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 0, 1, 1, 1 } };
    int startx = 0;
    int starty = 0;

    int endx = maze.length - 1;
    int endy = maze[maze.length - 1].length - 1;
    /*
     * This is generalised in case you use diff col size for each row. Otherwise you can use maze[0].length.
     * And if rows= cols always you can use maze.length itself.
     */

    if (isPath(maze, startx, starty, endx, endy))
      System.out.println("there is a path!");
    else
      System.out.println("there is no path!");
    print(maze);
  }

  // this is the main maze traversal function. only forward and downward motion
  static boolean isPath(int[][] maze, int x, int y, int endx, int endy) {
    if (x == endx && y == endy)
      return true;
    if (x + 1 < maze.length && maze[x + 1][y] == 1 && isPath(maze, x + 1, y, endx, endy))
      return true;
    else if (y + 1 < maze[x].length && maze[x][y + 1] == 1 && isPath(maze, x, y + 1, endx, endy))
      return true;
    return false;
  } // uses backtracking.

  // this function only prints the maze
  static void print(int maze[][]) {
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[i].length; j++)
        System.out.print(maze[i][j] + ", ");
    }
    System.out.println("");
  }

}