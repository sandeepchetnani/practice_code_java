class ConditionalOperator
{
public static void main(String args[])
{
int num1=100;
int num2=10000;
int num3=500;
//int a=num1>num2 ? num1:num2;   use this or below single line method is also correct
//int b=num3>a ? num3:a;


int b=num1>num2 ? (num1>num3 ? num1:num3) : (num2>num3 ? num2:num3);
System.out.println(b);




}
}