package calci;

class BasicCalci extends AbsCalci {
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
