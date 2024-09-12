public class RecursiveFactorial {
    public static void main(String[] args) {
        int ip=5;
        System.out.println(factorial(ip));
    }
    public static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
