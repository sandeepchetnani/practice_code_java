import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a word");
char c=sc.next().charAt(0);

if(c>='A' && c<='Z' || c>='a' && c<='z')
{
System.out.println("its a alphabet");
}
else
{
System.out.println("it is not a alphabet");
}






}}