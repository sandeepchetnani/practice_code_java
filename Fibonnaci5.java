// digits of number all are fibonnaci no or not

class Fibonnaci5
{
public static void main(String args[])
{
	
        int n=1235;
	int count=0;
	int count1=0;
        while(n!=0)
	{
	int rem=n%10;
        if(rem==0 || rem==1 || rem==2 || rem==3 || rem==5 || rem==8)
	{
	count++;
	}
	count1++;
	n=n/10;
	}
    if(count==count1){System.out.println("All the digits are fibonnaci no");}
    else{System.out.println("All the digits are not fibonnaci no");}
        


}}