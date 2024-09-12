/*Write a program to read a weekday number and print weekday name using switch statement*/

cm
import java.util.Scanner;
class Days
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a weekday number");
int choice = sc.nextInt();

switch(choice)
{
case 1:
{ System.out.println("Its sunday");
break;}
case 2:
{ System.out.println("Its Monday");
break;}
case 3:
{ System.out.println("Its Tuesday");
break;}
case 4:
{ System.out.println("Its Wednesday");
break;}
case 5:
{ System.out.println("Its Thursday");
break;}
case 6:
{ System.out.println("Its Friday");
break;}
case 7:
{ System.out.println("Its saturday");
break;}
}





}
}