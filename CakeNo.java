public class CakeNo {
    public static void main(String[] args) {
        int ip=5;
        System.out.println(cake(ip));
        ip=4;
        System.out.println(cake(ip));
        ip=1;
        System.out.println(cake(ip));
        
    }
    public static int cake(int n)
    {
        return ((n*n*n + 5*n) + 6) / 6;
    }
    
}
