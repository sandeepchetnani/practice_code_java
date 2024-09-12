class ArmStrongNo2
{
public static void main(String[] args)
{
	int n=153;
	int temp=n;
	int count=0;
	int sum=0;

	for(int i=n;i>0;i/=10)
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
       if(n==sum){System.out.println("Arm strong No");}
       else{System.out.println("Not a Arm Strong No");}









}}