public class SameNameVariable {
    static int n=100;
    public static void main(String[] args) {
        test(100);

        
    }
    public static void test(int n)
    {
        if(SameNameVariable.n==n)
        {
            System.out.println("great");
        }

    }
}
