public class PascalTriangle {
    public static void main(String[] args) {
        int num=5;
        for(int n=0;n<num;n++)
        {
        for(int r=num-n;r>=0;r--)
        {
       System.out.print(" ");
        }
        for(int r=0;r<=n;r++){
            System.out.print((fact(n)/(fact(n-r)*fact(r)))+" ");
        }
        System.out.println();
        }
        
    }
    public static int fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
       fact=fact*i;
        }
        return fact;
    }
}
