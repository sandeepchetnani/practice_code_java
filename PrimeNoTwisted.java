class PrimeNoTwisted
{
public static void main(String args[])
{
int n=13;
int flag=0;
int temp=n;
int new1=0;

int flag1=0;
if(n==0||n==1)
{
System.out.println("its not a prime no");
}
else
{
for(int j=2;j<=n/2;j++)
{
if(n%j==0)
{System.out.println("its not a prime no");
flag=1;
break;}
}
if(flag==0)
{
int reverse=n%10;
new1=(new1*10)+reverse;
n=n/10;
if(new1==0||new1==1)
{
System.out.println("its not a prime no");
}
else
{
for(int i=2;i<=new1/2;i++)
{
if(new1%i==0)
{System.out.println("its not a prime no");
flag1=1;
break;}
}
if(flag1==0)
{ System.out.println("its a twisted prime no");}
}}
}}}