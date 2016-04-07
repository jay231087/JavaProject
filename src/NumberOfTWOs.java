public class NumberOfTWOs {
  public void find2(int num){
    for(int i=0;i<=num;i++){
      String s = ""+i;
      if(s.contains("2")){
        System.out.println(""+i);
      }
      s=null;
    } 
 }
 public static void main(String[] args) {  
   NumberOfTWOs n = new NumberOfTWOs();
   n.find2(21);  
 }
}
