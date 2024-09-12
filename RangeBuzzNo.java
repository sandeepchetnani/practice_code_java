class RangeBuzzNo
{
public static void main(String args[])
{
        int start=100;
        int end=200;
        while(start<=end)
	{
        if(start%7==0 || start%10==7)
	{
        System.out.println("Its a Buzz No: "+start);
	}
        start++;
        }

}
}