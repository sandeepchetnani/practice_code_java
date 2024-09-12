class Method2{
public static void main(String args[])
{
 inrtodollar(100);


}
public static void inrtodollar(double inr){
 double dollar=inr/82.92;
System.out.println(dollar);
dollartodirham(dollar);
}
public static void dollartodirham(double dollar){
double dirham=dollar*3.67;
System.out.println(dirham);
dirhamtoeuro(dirham);

}
public static void dirhamtoeuro(double dirham){
double euro=dirham*0.25;
System.out.println(euro);
}

}