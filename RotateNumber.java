class RotateNumber
{
public static void main(String args[])
{
System.out.println(Rotate(1234));


}
	public static int Rotate(int num)
	{
	int ans=0;
	int rem=num%10;
	num=num/10;
	int ct=count(num);
	ans=rem*pow(10,ct)+num;
	return ans;
	}
	public static int count(int num)
	{
	int count =0;
	while(num!=0){count++;
	num/=10;
	}
	return count;
	}

	public static int pow(int base,int raise)
	{
	int pow=1;
	for(int i=0;i<raise;i++)
	{
	pow=pow*base;
	}
	return pow;
	}








}