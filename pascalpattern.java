public class pascalpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print(Utility.factorial(i)/(Utility.factorial(i-j)*Utility.factorial(j))+" ");
        }
        System.out.println();
        }
    }
}
