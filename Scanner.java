import java.util.Scanner;
class Scanner1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num1=sc.nextInt();
System.out.println("The number entered is:"+num1);

System.out.println("Enter a Short number:");
Short num2=sc.nextShort();
System.out.println("The number entered is:"+num2);

System.out.println("Enter a Byte number:");
byte num3=sc.nextByte();
System.out.println("The number entered is:"+num3);

System.out.println("Enter a Long number:");
long num4=sc.nextLong();
System.out.println("The number entered is:"+num4);

System.out.println("Enter a character:");
char ch=sc.next().charAt(0);
System.out.println("The character entered is:"+ch);

System.out.println("Enter a float number:");
float num5=sc.nextFloat();
System.out.println("The number entered is:"+num5);

System.out.println("Enter a double number:");
double num6=sc.nextDouble();
System.out.println("The number entered is:"+num6);

System.out.println("Enter a boolean:");
boolean s=sc.nextBoolean();
System.out.println("The boolean value entered is:"+s);

System.out.println("Enter a String single line:");
String st=sc.next();
System.out.println("The String entered is:"+st);

System.out.println("Enter a Multiple words strings:");
String st1=sc.nextLine();
System.out.println("The String entered is:"+st1);
}
}