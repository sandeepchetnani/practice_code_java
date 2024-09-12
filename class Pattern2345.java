class Pattern234
{
public static void main(String[] args)
{
for(int i=1;i<=9;i++)
{
for(int j=i;j<=10;j=j++)
{
System.out.print(i+" * "+j+" = "+(j*i)+"   ");
}
System.out.println();
}

for(int s=10;s<=10;s++)
{
for(int j=s;j<=10;j=j++)
{
System.out.print(j "*");
System.out.print("  ");
}
for(int j=20;j<=100;j=j+10)
{
System.out.print(j);
System.out.print("   ");
}

System.out.println();
}




}
}