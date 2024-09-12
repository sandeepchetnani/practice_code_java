class Impl
{
     Impl()
    {
    }
   private static Impl instance;

    public static Impl check()
    {
        if(instance==null)
        {
            instance=new Impl();
        }
        return instance;
    }}
public class Singleton
{   public static void main(String[] args) {
     Impl imp=new Impl();
     Impl imp2=new Impl(); 
     System.out.println(imp);
     System.out.println(imp2);
    }
}