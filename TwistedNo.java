import java.util.Scanner;
class TwistedNo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int temp=num;
int sum=0;
int rev=0;

if(temp%2==0)
{
while(temp>0)
{
 sum=temp%10; 
 rev=rev*10+temp;
 temp=temp/10;
}
if(rev%2==0)
{
System.out.println(num+"Its a Twisted pair no");
}
else
{
System.out.println(num+"Not a twisted pair no");
}
}
else{
System.out.println(num+"not a twisted pair");
}









}
}