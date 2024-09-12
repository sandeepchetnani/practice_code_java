import java.util.Scanner;
public class TechNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No to check: ");
        int ip=sc.nextInt();
        System.out.println(techNo(ip));
        
    }
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
    public static boolean techNo(int num)
    {
        int ans=0;
        int temp=num;
        int ct=count(num);
        if(ct%2==0)
        {
            int rem=num%pow(10,ct/2);
            num=num/pow(10,ct/2);
            ans=rem+num;
            ans=ans*ans;

        }
        return temp==ans;
    }
    public static int pow(int base,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow*=base;
        }
        return pow;
    }
}
