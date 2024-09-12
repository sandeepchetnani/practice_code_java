class Coprime
{
public static void main(String args[])
{
int n1=14,n2=30;
int flag=0;
int small=n1>n2?n2:n1;
	while(true)
	{
	if(n1%small==0 && n2%small==0)
	{
	  	break;
	}
	small--;
	}
if(small==1)
{
	System.out.println("its a coprime");}
else
{
	System.out.println("its not a coprime");}
}
}