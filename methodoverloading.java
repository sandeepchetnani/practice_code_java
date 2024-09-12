public class methodoverloading {
    public void a()
    {
   System.out.println("from void");
    }
    public void a(int a,int b)
    {
   System.out.println("from int");
    }
    public void a(double a,char b)
    {
    System.out.println("from double"
    );
    }
    public static void main(String[] args) {
        methodoverloading b=new methodoverloading();
        b.a(12.1,'c');
    }
}
