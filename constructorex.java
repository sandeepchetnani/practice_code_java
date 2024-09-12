public class constructorex {
    int a=10;
    String s;
    {
        System.out.println("hi this is a non static block");
    }
    constructorex()
    {
        System.out.println("inside the constructor");
        
    }
    constructorex(String b)
    {
        System.out.println("this is parameterised constructor");
        //this.s=s; or give different name
        s=b;
    }

    public void random(){
        System.out.println(a);
        System.out.println(s);
    }
    public static void main(int a) {
        System.out.println(a);
        System.out.println("from the main overloaded methodo");
    }
    public static void main(String[] args) {
        constructorex cs=new constructorex("sandeep");
        constructorex cb=new constructorex();
        cs.random();
        cb.random();
        main(10);
     


    }
}
