import java.util.Scanner;
class Palindrome5{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  a number");
int n=sc.nextInt();
int ans=0,remainder;
int temp=n;
while(temp>0)
{
remainder=temp%10;

ans=(ans*10)+remainder;
temp=temp/10;

}
if(n==ans){System.out.println("its a palindrome no");}
else{System.out.println("Not a palindrome no");}




}

}