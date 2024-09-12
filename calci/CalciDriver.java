package calci;

class CalciDriver extends AbsCalciVer1 {
    double pow(double a,double b)
    {
        int pow=1;
        for(int i=0;i<b;i++)
        {
            pow*=a;
        }
        return pow;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    int add(int ...a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
}
