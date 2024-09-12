package calci;

class CalciDriver2 extends AbsCalciVer2 {
    double square(double a)
    {
        return a*a;
    }
    double cube(double a)
    {
        return a*a*a;
    }public int add(int a,int b)
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
