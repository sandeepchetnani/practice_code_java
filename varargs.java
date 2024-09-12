import java.util.*;
public class varargs {
public static int sum(int... a)
{
    int sum=0;
   for(int i=0;i<a.length;i++)
   {
    sum+=a[i];
   } 
   return sum;
   

    

}

    public static void main(String[] args) {
       System.out.println(sum(1,2,3));
    }
}
