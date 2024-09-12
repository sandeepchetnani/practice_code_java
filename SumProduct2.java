import java.util.Scanner;
class SumProduct2
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
int product=1;
int fact=1;
	for(int i=1;i<=num/2;i++)
	{
         fact=fact*i;
          sum=sum+fact;
         product=product*fact;
	}
        
if(sum==product)
{
System.out.println("Sum and product of factors are equal");
}
else
{
System.out.println("Sum and product of factors are not equal");
}

}
}