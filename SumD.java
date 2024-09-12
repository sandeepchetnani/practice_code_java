class SumD
{
public static void main(String[] args)
{
int num=1111;
int sum=0;
int total=0;
while(num>0)
{
sum=num%10;
 total=total+sum;
num=num/10;
}
System.out.println("the sum of digit is "+ total);


}}




