class PatternName
{
public static void main(String args[])
{
int n1=5,n2=8;
for(int i=0;i<=n1;i++){
for(int j=0;j<=n2;j++){
if(i==0 &&j==0 ||i==0 &&j==1 ||i==0 &&j==2 ||i==0 &&j==3 ||i==1 &&j==0 ||i==2 &&j==0 ||i==3 &&j==0 ||i==3 &&j==1 ||i==3 &&j==2 ||i==3 &&j==3 ||i==4 &&j==3 ||i==5 &&j==3 ||i==5 &&j==0||i==5 &&j==1 ||i==5 &&j==2||

i==0 &&j==5 ||i==1 &&j==5 ||i==2 &&j==5 ||i==3 &&j==5 ||i==4 &&j==5 ||i==5 &&j==5 ||i==3 &&j==6 ||i==3 &&j==7 ||i==3 &&j==8 ||i==0 &&j==8 ||i==1 &&j==8 ||i==2 &&j==8 ||i==4 &&j==8 ||i==5 &&j==8||i==0 &&j==6||i==0 &&j==7||

i==0 &&j==10 ||i==1 &&j==10 ||i==2 &&j==10 ||i==3 &&j==10 ||i==4 &&j==10 ||i==5 &&j==10 ||i==0 &&j==14 ||i==1 &&j==14 ||i==2 &&j==14 ||i==3 &&j==14 ||i==4 &&j==14 ||i==5 &&j==14 ||i==1 &&j==11 ||i==2 &&j==12 ||i==3 &&j==13 )

{System.out.print("*"+" ");}
else{System.out.print(" "+" ");}
}
System.out.println();
}
}}