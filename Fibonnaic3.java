//nth fibonnaci no


class Fibonnaic3
{
public static void main(String args[])
{
	long num1=0;
        long num2=1;
        long num3=0;
        long n=10;
  
        for(int i=2;i<=n;i++)
	{
	num3=num1+num2;
        num1=num2;
        num2=num3;
     
	}
        System.out.println("the 10th fibonanic no is "+num3);
}}