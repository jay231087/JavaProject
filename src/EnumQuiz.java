package com.geekofgeek.in;

public class EnumQuiz {
  static Colors colors;
  public static void main(String[] args) {
    System.out.println(colors.Red.count+colors.Blue.count+colors.Green.count);
  }
}

enum Colors{
  Red(1),Blue(2),Green(3);
  int count =0;
  Colors(int count){
    count++;
  }
}
