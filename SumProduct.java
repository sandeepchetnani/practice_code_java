import java.util.Scanner;
class SumProduct
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
int product=1;
	while(num>0)
	{
         int rem=num%10;
         sum=sum+rem;
         product=product*rem;
         num=num/10;
	}
if(sum==product)
{
System.out.println("Sum and product are equal");
}
else
{
System.out.println("Sum and product are not equal");
}

}
}