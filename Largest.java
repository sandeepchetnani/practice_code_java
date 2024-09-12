public class Largest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=90;
        int d=5;
        if(a>b && a>c && a>d)
        {
            System.out.println(a);
        }
        else if(b>c && b>d)
        {
            System.out.println(b);
        }
        else if(c>d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
        
    }
}
