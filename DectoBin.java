class DectoBin
{
    public static void main(String args[])
    {
        int ans=Integer.parseInt(dectoBin(1));
        int ct=count(ans);
        if(ct%2==0)
        {
            System.out.println("its a odis no");
        }
        else{
            System.out.println("its not a odis no");
        }
        

    }
    public static String dectoBin(int num)
    {
        String ans="";
        while(num!=0)
        {
            ans=ans+num%2;
            num/=2;
        }
        return ans;
    }
    public static int count(int num)
    {
        int  count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }
}