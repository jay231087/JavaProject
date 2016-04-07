package home.trial.ds;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
   List<Integer> a = new ArrayList<Integer>();
   try{
     for(int i=0;i<10;i++){
       try{
         List<Object> ab = new ArrayList<Object>();
         ab.add(new String("ssf"));
         Integer str = (Integer) ab.get(0);
       }catch(ClassCastException castException){
         a.add(1234);
       }
     }
   }catch(Exception castException){
     System.out.println(a.get(0));
   }   
  }

}
