import java.util.Scanner;
class Scanner2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the asked details:");
System.out.println("Please enter your name:");
String name=sc.nextLine();

System.out.println("Please enter your mobile no:");
Long number=sc.nextLong();

System.out.println("Please enter the Age:");
int age=sc.nextInt();

System.out.println("Please enter the Gender:");
String gender=sc.next();

System.out.println("Please enter the Id:");
int id=sc.nextInt();




System.out.println("The Entered details of the users are:");
System.out.println("Name: "+name );
System.out.println("Mobile No: "+number);
System.out.println("Age: "+age);
System.out.println("Gender: "+gender);
System.out.println("Id: "+id);

}}