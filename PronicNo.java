class PronicNo
{
public static void main(String args[])
{
	int n=6;
	int flag=0;
	for(int i=0;i<=n;i++)
	{
        if(i*(i+1)==n)
	{
	System.out.println("its a pronic number "+i+" "+(i+1)+" are the numbers");
	flag=1;
	break;
	}
	}
	if(flag==0){System.out.println("its not a pronic number");}
	













}
}