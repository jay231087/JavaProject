public class GcdEuclidean { 
  public int findGcdOfTwoNumbers(int num1, int num2){
    int quotient = 0,remainder=num1%num2,gcd=0;
    while(remainder!=0){
      remainder = num1%num2;
      quotient = num1/num2;
      num1 = (quotient*num2) + remainder;
      System.out.println(num1);
      gcd = num2;
      num1 = num2;
      num2 = remainder;
    }
    return gcd;
  }
}

class TestGcd{
  public static void main(String[] args) {
    GcdEuclidean gcdeuc = new GcdEuclidean();
    int gcd= gcdeuc.findGcdOfTwoNumbers(270, 192);
    System.out.println(gcd);
  }
}
