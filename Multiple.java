import java.util.Scanner;
class Multiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
int temp=num;
int reverse=0;
	for(int i=1;i<=num/2;i++)
        {
         if(num%i==0)
	{
         sum=sum+i;
	}
        }
        if(num==sum)
        {
          while(temp>0)
          {
           int rem=temp%10;
          reverse=(reverse*10)+rem;
             temp/=10;
          }
         if(reverse==num)
 	{
         System.out.println("its a perfect palindrome no");
	}
        else{ 
          System.out.println("its a perfect but not palindrome no");
        }}
        else
        {
         int sum2=0;
         while(num>0)
	{
         int rem=num%10;
         sum2 =sum2+rem;  
         num/=10;      
         } 
         System.out.println("sum of digits are "+ sum2);
	}


}
}