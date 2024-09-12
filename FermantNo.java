public class FermantNo {
    public static void main(String[] args) {
        double ip=10;
        isfermant(ip);
    }
    public static void isfermant(double num)
    {
        double ans=0;
        double upper=0;
       for(int i=0;i<num;i++)
       {
        upper=power(2,i);
        ans=power(2,upper)+1;
        System.out.println(ans);
        ans=0;
       }
    }
    public static double power(double base,double raise)
    {
    double pow=1;
    for(int i=0;i<raise;i++)
    {
      pow*=base;  
    }
    return pow;
    }

}
