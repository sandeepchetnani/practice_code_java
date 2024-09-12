class RangeNeonNo {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

       for(int i=start;i<=end;i++)
	{
	int sum=0;
	int prod=i*i;
	while(prod!=0)
	{
	int last=prod%10;
	sum=sum+last;
	prod/=10;
	}
	if(sum==i)
	{
	System.out.println(sum);
	}
	}
}
}
