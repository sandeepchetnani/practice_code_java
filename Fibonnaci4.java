//nth fibonnaci no prime or not


class Fibonnaci4
{
public static void main(String args[])
{
	long num1=0;
        long num2=1;
        long num3=0;
        long n=5;
        int flag=0;
  
        for(int i=2;i<=n;i++)
	{
	num3=num1+num2;
        num1=num2;
        num2=num3;
	}
        if(num3==0 || num3==1)
         {
          System.out.println("its  not a prime no");
         }
         else{
        for(int i=2;i<=num3/2;i++)
	{
	if(num3%i==0){
	System.out.println("its  not a prime no");
	flag=1;
	break;
	}}}
        if(flag==0){System.out.println("its a fibonnaci prime no");}
}}