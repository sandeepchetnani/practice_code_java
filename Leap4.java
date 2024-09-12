import java.util.Scanner;
class Leap4
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the starting year");
  int start=sc.nextInt();
  System.out.println("Enter the ending year");
  int end=sc.nextInt();
  while(start<=end)
{
   
     if((start%4==0 && start%100!=0) || start%400==0)
     {
     if(start%2==0){
      System.out.println(start);
     }
     }
     start++;
      
}


}}