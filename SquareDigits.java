class SquareDigits {
   public static void main(String args[])
   {
     int ip=125;
     System.out.println(extract(ip));
   }
   public static int square(int num)
   {
    int square=num*num;
    return square;
   }    
   public static int extract(int num)
   {
    int temp;
    int sum=0;
    while(num!=0)
    {
        temp=num%10;
        sum+=square(temp);
        num/=10;

    }
    return sum;
   }
}
