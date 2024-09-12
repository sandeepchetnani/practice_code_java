public class BintoDec {
    public static void main(String[] args) {
        System.out.println(bintodec(1111));
        
    }
    public static int bintodec(int num)
    {
        int i=0;
        int ans=0;
        while(num!=0)
        {
            ans+=num%10*power(2, i);
            num/=10;
            i++;
        }
        return ans;

    }
    public static int power(int base,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++ )
        {
            pow*=base;
        }
        return pow;
    }
}
