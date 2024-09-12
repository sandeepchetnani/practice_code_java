
public class Factorial5 {
   public static void main(String[] args)
    {
    int num=5;
    System.out.println(factorial(num));
   }


   public static int factorial(int num)
   {
    int fact=1;
    for(int i=1;i<=num;i++)
    {
        fact*=i;
    }
    return fact;
   }
    
}