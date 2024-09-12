
public class InstanceOf {
    public static void main(String[] args) {
        //A a=new A();
        Object o= new A();
        System.out.println(o instanceof Object);
        System.out.println(o instanceof B);
      //  System.out.println(a);
       // System.out.println(a instanceof B);
    }
    

    
}
class A{

}
class B extends A{  

}
class C extends A{

}

