class EvenOdd
{
public static void main(String[] args)
{
int num=1234;
int count=0,count1=0;
while(num>0)
{
int sum=num%10;
if(sum%2==0)
{
count++;
}
else{
count1++;
}
num=num/10;

}
System.out.println("Even digit count is " +count);
System.out.println("Odd digit count is " +count1);


}
}