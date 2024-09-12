public class LucasNo {
    public static void main(String[] args) {
        int ip=10;
        System.out.println(lucas(ip));
        
    }
    public static int lucas(int num)
    {
        int num3=0;
        int num1=2;
        int num2=1;
        for(int i=3;i<=num;i++)
        {
            num3=num1+num2;
            
            num1=num2;
            num2=num3;
        }
        return num3;
       
    }
}
