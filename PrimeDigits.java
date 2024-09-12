class PrimeDigits{
	public static void main(String args[])
	{
		int ip=2357;
		  
	   System.out.println(extract(ip));
	
	
	
	}
	public static boolean isprime(int num)
		{
			int i;
		for(i=2;i<num;i++)
		{
		if(num%i==0)
		{
		break;
		}}
		if(num==i)
		{
		return true;
		}
		else{return false; }
	}

	public static int extract(int num)
	{
	int sum=0;
	
	while(num!=0)
	{
		int temp=0;
	    temp=num%10;
	if(isprime(temp))
	{
	sum=sum+temp;
	}
	num/=10;
	}
	return sum;
	}
	}