class NeonNo
{
public static void main(String ags[])
{
	int n=10;
        int mul=n*n;
	int sum=0;
        while(mul!=0)
	{
	int div=mul%10;
        sum=sum+div;
	mul=mul/10;
	}
	if(sum==n)
	{
	System.out.println("its a Neon No");
	}
	else{System.out.println("Not a Neon NO");}

}
}