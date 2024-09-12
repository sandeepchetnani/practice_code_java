class Problem4Swap
{
 public static void main(String[] args)
 {
  int a=5,b=10;
  System.out.println("Before swaping value of a and b is "+a+" "+b);
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("After swaping value of a and b is "+a+" "+b);
  }
}
