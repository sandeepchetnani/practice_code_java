import java.util.Scanner;
public class ArrEx5 {
    int arr[]={1,2,3,5,6,3};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        ArrEx5 a=new ArrEx5();
        if(a.findElement(num)==0)
        {
            
            System.out.println(" not found");
        }
        else{
            System.out.println("no of time it occurs in program:"+a.findElement(num) );
           System.out.println("found");
        }


    }
      int  findElement(int num){
        int count=0;
          for(int i=0;i<arr.length;i++)
          {
         if(arr[i]==num)
         {
            count++;
         } 
          }
          return count;
          

        

    }
}
