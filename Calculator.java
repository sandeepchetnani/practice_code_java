import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("****Calculator*******");
System.out.println("Enter * for multiplication");
System.out.println("Enter / for division");
System.out.println("Enter + for Addition");
System.out.println("Enter - for Subtraction");

char choice = sc.next().charAt(0);
switch(choice)
{
case '*':
{
System.out.println("Enter no 1");
int num1=sc.nextInt();
System.out.println("Enter no 2");
int num2=sc.nextInt(); 
int num3=num1*num2; 
System.out.println("the multiplication is"+num3);
break;
}
case '/':
{ 
System.out.println("Enter no 1");
double num1=sc.nextDouble();
System.out.println("Enter no 2");
double num2=sc.nextDouble(); 
double num3=num1/num2; 
System.out.println("the Divison is"+num3);
break;
}

case '+':
{ 
System.out.println("Enter no 1");
int num1=sc.nextInt();
System.out.println("Enter no 2");
int num2=sc.nextInt();
int num3=num1+num2; 
System.out.println("the Addition is"+num3);
break;
}
case '-':
{ 
System.out.println("Enter no 1");
double num1=sc.nextDouble();
System.out.println("Enter no 1");
double num2=sc.nextDouble();
double num3=num1-num2; 
System.out.println("the Subtraction is"+num3);
break;
}
default:
{
System.out.println("please enter correct operation");
}
}

}
}
