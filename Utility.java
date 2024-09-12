public class Utility {
    public static void main(String[] args) {
        System.out.println(prime(7));
        System.out.println(count(1233));
        System.out.println(extract(1234));
        System.out.println(power(2, 2));
        System.out.println(factorial(5));
        System.out.println(reverse(1234));
        
    }
    //count method
    public static int count(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    //power method
    public static int power(int base,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow*=base;
        }
        return pow;
    }

    //Factorial Method
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    //reverse method

    public static int reverse(int num)
    { 
        int num2=0;
        while(num!=0){
            num2=(num2*10)+num%10;
            num/=10;
        }
        return num2;
    }

    //extract method

    public static int extract(int num)
    {
        int ans=0;
        while(num!=0)
        {
         ans+=num%10;
         num/=10;
        }
        return ans;
    }

    //prime method

    public static boolean prime(int num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        else{
            int i=2;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    break;
                }
            }
            if(num==i)
            {
                return true;
            }
            else{
                return false;
            }

        }
    }


}
