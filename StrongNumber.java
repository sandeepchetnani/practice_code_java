import java.util.Scanner;
class StrongNumber
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
	int n=sc.nextInt();
        int temp=n;
        int fact;
        int sum=0;
        while(n!=0)
	{
	fact=n%10;
        int fact1=1;
	for(int i=fact;i>=1;i--)
        {
       
        fact1=fact1*i;
        }
        sum=sum+fact1;
        n=n/10;
        }
        if(temp==sum)
	{
	System.out.println("its a strong number");
	}
	else{System.out.println("its not a strong number");}
}
}