/**
 * Upcaste
 */
public class Upcaste {
   public static void main(String[] args) {
    Parent p=new child();
    p.m();
   }

    
}
class Parent{
  
 void n(){
    System.out.println("from parent");
 }

}
class child extends Parent{
      void m(){
     System.out.println("from child");
      }
}