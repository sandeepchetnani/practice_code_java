class RangeArmStrongNo
{
public static void main(String[] args)
{
	int start=10;
	int end=200000;
	
        for(int j=start;j<=end;j++){
        int count=0;
	int sum=0;
        int temp=j;
	for(int i=j;i>0;i/=10)
	{
	count++;
	}
	while(temp!=0)
	{
	int prod=1;
	int rev=temp%10;
	for(int i=0;i<count;i++){prod=rev*prod;}
        sum=sum+prod;
        temp=temp/10;
	}
       if(j==sum){System.out.println(sum);
}

}

}
}