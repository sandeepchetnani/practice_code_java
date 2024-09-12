/**
 * Early
 */
 class Early {
int a=5;
     void sandeep(){
        System.out.println("hello");
     }
}
class B{
    Early e =new Early();

}
   
class c{
    
public static void main(String[] args) {
    B ct=new B();
   
   ct.e.sandeep(); 
}
}