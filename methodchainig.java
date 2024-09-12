public class methodchainig {
    int a=5;
    int b=2;
    String name1;
    String age;
    methodchainig(){
        
    }
     public methodchainig name1(String name1){
         
         System.out.println(name1);
         return this;
     }

     public methodchainig age(String age){
       
        System.out.println(age);
        return this;
    }

    public static void main(String[] args) {
        methodchainig m1=new methodchainig();
        m1.name1("sandeep").age("10");
    }

}
