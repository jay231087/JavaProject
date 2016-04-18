package com.geekofgeek.in;

public class PalindromTriangle {
  public static void main(String[] args) {
    int i,j,k;
    int n=9;
    for(i =1; i<= n; i++){
      for(j = i; j<n; j++){
        System.out.println(" ");
        for(j = 1; j<=i ; j++){
          System.out.println(j);
          for(j = i-1; j>= 1;j--){
            System.out.println(j);
            System.out.println("\n");
          }
        }
      }
    }
  }
}
