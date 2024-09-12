public class StrongNumber5 {
    public static void main(String[] args) {
       int num=14;
       int a;
       System.out.println(a=10);
       if(isStrong(num))
       {
        System.out.println("is a strong number");
       }
       else{
        System.out.println("its not a strong number");
       }



    }
    public static boolean isStrong(int num)
    {
        int sum=0;
        int temp=num;
        while(temp!=0)
        {
            sum+=Factorial5.factorial(temp%10);
            temp/=10;
        }
        if(sum==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
    


}

