class ArmStrong
{
public static void main(String args[])
{
int n=153;
int temp=n;
int count=0;

int last=0;
int sum=0;
while(temp!=0)
{
count++;
temp=temp/10;
}
for(int i=n;i!=0;i=i/10)
{
last=i%10;
int rev=1;
for(int j=0;j<count;j++)
{
rev=rev*last;
}
sum=sum+rev;
}
if(n==sum)
{System.out.println("its a arm strong number");}
else
{System.out.println("no a arm strong number");}











}}