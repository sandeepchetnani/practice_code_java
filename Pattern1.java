import java.util.*;
class Pattern1{
     public static void main(String args[])
     {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of rows required");
     n=sc.nextInt();
     for(int i=0;i<=n;i++)
     {
       for(int j=0;j<i;j++)
       {
       System.out.print("* ");
       }
       System.out.println("");
     }
      

     }
             }