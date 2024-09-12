class pattern21
{
public static void main(String args[])
{
int ans,inceven=7,incodd=1;
int n=4;
for(int i=1;i<=n;i++)
{
ans=i;
System.out.print(ans+" ");
for(int j=1;j<n;j++)
{
if(j%2==0){
ans=ans+incodd;
System.out.print(ans+" ");}
else{
ans=ans+inceven;
System.out.print(ans+" ");}

}
System.out.println();
inceven-=2;
incodd+=2;
}








}








}