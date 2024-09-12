import java.util.Scanner;
class PinVerification
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int SetPin=1234;
int attempt=0;
do
{
System.out.println("Enter the pin");
int pin=sc.nextInt();
if(pin==SetPin)
{ 
System.out.println("Login Success");
break;
}
attempt++;
if(attempt<3){
System.out.println("Attempt failed, Please try again");
System.out.println("Number of attempt remain is "+(3-attempt));
}
}while(attempt<3);

if(attempt==3){
System.out.println("You reached the maximum no of attempts");
}




}}