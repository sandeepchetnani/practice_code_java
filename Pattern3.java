import java.util.Scanner;
class Pattern3
{
public static void main(String args[])
{   int n1=1;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<=n;i++)
   {
   for(int j=n-i;j>0;j--){ System.out.print(" ");    }
   for(int j=0;j<i;j++){ System.out.print(n1+" ");
        n1++;}
System.out.println();   
}


}

}