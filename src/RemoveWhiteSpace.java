public class RemoveWhiteSpace {
  public static void removeSpace(char[] string) {
    int spacePtr = 0;
    while(spacePtr < string.length && string[spacePtr] != ' '){
      spacePtr++;
    }
    int index = 0;
    for(index = spacePtr;index < string.length; index++){
      if(string[index] == ' '){
        continue;
      }else{
        swap(string,spacePtr,index);
        while(spacePtr < string.length && string[spacePtr] != ' '){
          spacePtr++;
        }
      }
    }
    while(spacePtr < string.length){
      string[spacePtr] = 0;
      spacePtr++;
    }
    for(char c:string){
      System.out.print(c);
    }
    System.out.println();
  }

  private static void swap(char[] string, int spacePtr, int index) {
    char tmp = string[spacePtr];
    string[spacePtr] = string[index];
    string[index] = tmp;
  }

  public static void main(String[] args) {
//    removeSpace(" ab  bc d".toCharArray());
//    removeSpace("ab ed d d".toCharArray());
    String strentry= "ab ed d d";
    char str[]=strentry.toCharArray();
    int k=0;int idx=0;
    while(k < str.length){
      if(str[k] == ' '){
         if(str[idx] != ' '){
            str[idx] = str[k];
            idx++;
         }
      } else { str[idx] = str[k]; idx++;}
      k++;
    }
    System.out.println(str);
  }
}