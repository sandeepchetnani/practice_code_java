//instance only one object 1 
class Singleton5 {
    private Singleton5()
    {

    }

    private static Singleton5 instance;
 
    public static Singleton5 get()
    { 
        if(instance==null)
        {

            instance=new Singleton5();
        }
        return instance;
    }



}

public class Singleton2{
    public static void main(String[] args) {
        
        Singleton5 s1= Singleton5.get();
        Singleton5 s2= Singleton5.get();
        System.out.println(s1);
        System.out.println(s2);
    }
}
