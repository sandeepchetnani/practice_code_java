import java.util.Scanner;
class count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count1=0;
int sum=0;
while(num>0){
sum+=num%10;

count1++;
num=num/10;
}
System.out.println("sum is:"+sum);
System.out.println("count is:"+count1);




}
}