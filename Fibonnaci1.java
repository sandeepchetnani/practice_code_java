import java.util.Scanner;
class Fibonnaci1
{
public static void main(String args[])
{
int num1=0,num2=1,sum;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print(num1+" "+num2+" ");
for(int i=2;i<n;i++){
sum=num1+num2;
num1=num2;
num2=sum;
System.out.print(sum+" ");



}


}
}