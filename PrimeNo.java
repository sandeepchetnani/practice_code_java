class PrimeNo2
{
public static void main(String args[])
{
int number=5;
int flag=0;

if(n==0||n==1)
{
System.out.println("its not a prime no");
}
else
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println("its not a prime no");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("its a prime no");
}
}


}
}













}
}