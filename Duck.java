class Duck
{
public static void main(String args[])
{
int num=12340;
int count=0;
while(num>0)
{
int sum=num%10;
if(sum==0)
{
count++;
}
num=num/10;
}
if(count==0){
System.out.println("its not a duck number");
}
else{
System.out.println("its a duck number");
}



}}