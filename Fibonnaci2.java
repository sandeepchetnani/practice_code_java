//simple fibonnaci number

class Fibonnaci2
{
public static void main(String args[])
{
	double num1=0;
        double num2=1;
        double n=100;
        System.out.print(num1+" "+num2+" ");
        for(int i=2;i<n;i++)
	{
	double num3=num1+num2;
        num1=num2;
        num2=num3;
        System.out.print(num3+" ");
	}
        


}}