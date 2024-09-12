import java.util.Scanner;
class Leap2
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the starting year");
  int start=sc.nextInt();
  System.out.println("Enter the ending year");
  int end=sc.nextInt();
  int count=0;

     while(start<end){
     if((start%4==0 && start%100!=0) || start%400==0)
     {
      count++;
     }
     start++;
      }
  System.out.println("count is:"+count);
}

}


