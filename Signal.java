import java.util.Scanner;

class Signal{


public static void main(String args[])


{
Scanner sc=new Scanner(System.in);
System.out.println("whats the colour of signal");
String in=sc.next();

if(in.equalsIgnoreCase("red"))
{System.out.println("wait signal to turn green");}
else if(in.equalsIgnoreCase("green"))
{System.out.println("you can go now");}                                   
else if(in.equalsIgnoreCase("yellow"))
{ System.out.println("wait");}
else{System.out.print("you are color blind");}

}}
