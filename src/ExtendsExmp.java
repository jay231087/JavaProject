package com.geekofgeek.in;

public class ExtendsExmp {
  public ExtendsExmp(){
    System.out.println("Class ExtendsExmp");
  }
}

class ExtedsExmp1 extends ExtendsExmp{
  public ExtedsExmp1(){
    System.out.println("class ExtedsExmp1");
  }
}

class testExtends{
  public static void main(String[] args) {
    ExtendsExmp exmp = new ExtendsExmp();
    ExtedsExmp1 exmp1 = new ExtedsExmp1();
  }
}
