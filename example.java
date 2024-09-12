public class example {
    static int num=0;
    public static void main(String[] args) {
        System.out.println("welcome to main");
        test();
        
    }
    public static void test()
    {
       num++;
        while(num<3)
        {
            System.out.println("this is from tets");
             main(null);
        }
    } 
}
