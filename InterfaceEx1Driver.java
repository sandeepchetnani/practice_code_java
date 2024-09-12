public class InterfaceEx1Driver implements InterfaceEx1 {
    

         public void s()
         {
           System.out.println("deed");
         }
        
         public static void main(String[] args) {
            InterfaceEx1.b();
            InterfaceEx1Driver i=new InterfaceEx1Driver();
            i.s();
            i.c();


         }


}
