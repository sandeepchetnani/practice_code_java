public class LucasSeries {
    public static void main(String[] args) {
        int ip=10;
        lucas(ip);
        
    }
    public static void lucas(int num)
    {
        int num3=0;
        int num1=2;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=3;i<=num;i++)
        {
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
       
    }
}
