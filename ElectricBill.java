import java.util.Scanner;
class ElectricBill
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("****Electric Bill Calculator***");
System.out.println("Enter the units");
int units=sc.nextInt();
double billamount=0;
if(units<=50)
{billamount=units*0.50;}
else if(units<=200)
{billamount=0.50*50+(units-50)*0.75;}
else if(units<=450)
{billamount=0.50*50+150*0.75+(units-200)*1.20;}
else
{billamount=0.50*50+150*0.75+250*1.20+(units-450)*1.50;}

System.out.println("Enter your Area Deccan,Varje,Dattawadi");
String area=sc.next();
switch(area)
{
case "Deccan":
{
double totalamount=billamount-0.20*billamount;
System.out.println("Your bill after 20% discount is "+totalamount);
break;
}
case "Varje":
{
double totalamount=billamount-0.30*billamount;
System.out.println("Your bill after 30% discount is "+totalamount);
break;
}
case "Dattawadi":
{
double totalamount=billamount-0.20*billamount;
System.out.println("Your bill after 10% discount is "+totalamount);
break;
}
default:
{
System.out.println("Your bill is "+billamount);
}

}


}
}