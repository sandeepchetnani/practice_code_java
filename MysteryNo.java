public class MysteryNo {
    public static void main(String[] args) {
        int ip=154;
        int flag=0;
        for(int i=1;i<=ip;i++){
            int num1=11*i;
            int num2=Rotate(num1);
            if(ip==num1+num2){
               flag=1;
               break;
        }}
        if(flag==1){
            System.out.println("mystery no");
            
        }
        else{
            System.out.println("Not a Mystery No");
        }

        
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
