class Pattern23
{
public static void main(String args[])
{
int n=4;
int ans,inceven=5,incodd=0;
System.out.println("1");
for(int i=2;i<=n;i++)
{
ans=i;
System.out.print(ans+" ");
for(int j=1;j<i;j++)
{
if(j%2==0)
{
ans=ans+incodd;
System.out.print(ans+" ");
}
else{ans=ans+inceven;
System.out.print(ans+" ");}

}
System.out.println();
inceven-=2;
incodd+=2;
}






}}