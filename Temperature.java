public class Temperature {
  int i,j,k;
  Temperature(int y[][]){   
    for(i=0;i<y.length;i++){
      for(j=0;j<y[i].length;j++){
        k=k+1;
        y[i][j]=k;
      }
    }
    for(i=0;i<y.length;i++){
      for(j=0;j<y[i].length;j++){
        System.out.println(y[i][j]);
      }
    }
  }
}

class demoTemp{
  public static void main(String[] args) {
    int x[][] = new int[5][5];
    Temperature temp = new Temperature(x);
  }
}
