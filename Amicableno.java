public class Amicableno {
    public static void main(String[] args) {
        int num1=110;
        int num2=1210;
        isAmicable(num1, num2);
        
    }
    public static void isAmicable(int num1,int num2)
    {
        if(divisor(num1)==num2)
        {
            if(divisor(num2)==num1)
            {
                System.out.println("its a Amicable no");
            }
            else{
                System.out.println("its not a amicable No");
            }
        }
        else{
            System.out.println("its not a amicable no");
        }
        
      
    }
    public static int divisor(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
