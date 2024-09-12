//hcf


class Hcf
{
public static void main(String args[])
{
int n1=11,n2=12;
int small=n1<n2?n1:n2;

while(true){
if(n1%small==0 && n2%small==0)
{
System.out.println(n1+" "+n2+" is "+small);
break;

}
small--;
}



}

} 