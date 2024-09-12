// To calcualate the lcm of the number

class Lcm
{
public static void main(String args[])
{
int n1=20,n2=30;
int big=n1>n2?n1:n2;
while(true)
{
if(big%n1==0 && big%n2==0)
{
System.out.println(n1+"and"+n2+"="+big);
break;

}big++;
}

}
}