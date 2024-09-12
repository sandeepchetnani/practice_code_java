public interface InterfaceEx1 {
    
    
    
    void s();

     

    static void b()
    {

        System.out.println("hi");
    }

    default void c(){
          System.out.println("non static");
    }
    
     public static final int a=10;
     

} 
