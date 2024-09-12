class pattern22
{
public static void main(String args[])
{
int val;
int n=4;
for(int i=1;i<=n;i++)
{
val=i;
for(int j=1;j<=i;j++)
{
System.out.print(val+" ");
val=val+n-j;
}
System.out.println();

}
}}