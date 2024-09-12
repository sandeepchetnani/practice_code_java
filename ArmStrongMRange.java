class ArmStrongMRange
{
	public static void main(String[] args) {
		
		int start=100;
		int end=500;
		while(start<=end){
             if(isArmStrong(start)){
				System.out.println(start);

			 }
			 start++;

		}
	}
	public static boolean isArmStrong(int num)
	{
		int sum=0;
		int ct=count(num);
      for(int i=num;i!=0;i/=10)
	  {
		int rem=i%10;
		sum=sum+power(rem,ct);
	  }
	  return sum==num;
	} 
	public static int count(int num)
	{ 
		int count=0;
    while(num!=0){
		count++;
		num/=10;
	}
	return count;
	}
	public static int power(int num,int count)
	{
		int pow=1;
       for(int i=0;i<count;i++)
	   {
		pow=pow*num;
	   }
	   return(pow);
	}












}