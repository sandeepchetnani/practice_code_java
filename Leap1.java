import java.util.Scanner;
class Leap1
{
  public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the year");
  int year=sc.nextInt();
    if(year<1582)
    {
    System.out.println("Its outside the calendar month");
    }
    else
    {
     if((year%4==0 && year%100!=0) || year%400==0)
     {
      System.out.println("Its a leap year");
     }
     else{
     System.out.println("Its not a leap year");
     }
      }

}


}
