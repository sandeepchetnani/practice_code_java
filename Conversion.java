public class Conversion {
    public static void main(String[] args) {
        System.out.println(DectoBin(5));
        
        System.out.println(DectoOct(12345678));

        System.out.println(DectoHex(11223));

        System.out.println(bintoDec(111));

        System.out.println(OcttoDec(111));
    }
    public static String DectoBin(int num)
    {
        String ans="";
        while(num!=0)
        {
            ans=num%2+ans;
            num/=2;
        }
        return ans;
    }
    public static String DectoOct(int num)
    {
        String ans="";
        while(num!=0)
        {
            ans=num%8+ans;
            num/=8;
        }
        return ans;
    }
    public static String DectoHex(int num)
    {
        String ans="";
        while(num!=0)
        {
            int rem=num%16;
            if(rem>=0 && rem<=9)
            {
            ans=rem+ans;
            
        }
        else if(rem>=10 && rem<=15)
        {
            ans=((char)(55+rem))+ans; 
            
        }
        num/=16;

    }
        return ans;
    }

    public static int bintoDec(int num)
    {
        int ans=0;
        int i=0;
        while(num!=0)
        {

            ans+=num%10*power(2,i);
            num/=10;
            i++;
        }
        return ans;
    }
    public static int OcttoDec(int num)
    {
        int ans=0;
        int i=0;
        while(num!=0)
        {

            ans+=num%10*power(8,i);
            num/=10;
            i++;
        }
        return ans;
    }
    public static int power(int base,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow*=base;
        }
        return pow;
    }
    
}
