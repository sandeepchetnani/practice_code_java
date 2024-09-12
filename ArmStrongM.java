class ArmStrongM
{
	public static void main(String args[])
	{
	int ip=153;
	System.out.println(isArmstrong(ip));
	}
	public static int pow(int num,int count)
	{
	int pow=1;
	for(int i=0;i<count;i++)
	{
	pow=pow*num;
	}
	return pow;
	}
	public static int count(int num)
	{
	int count=0;
	while(num!=0)
	{
	count++;
	num/=10;
	}
	return count;
	}
	public static boolean  isArmstrong(int num)
	{
 	int ct=count(num);
	int sum=0;
	for(int i=num;i!=0;i/=10)
	{ int rem=i%10;
	sum=sum+pow(rem,ct);	}
	return sum==num;
	}

	
	
}