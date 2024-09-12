public class Strong {
    public static void main(String[] args) {
        int ip=40585;
      if(extract(ip)) {
     System.out.println("its a strong no");
      } 
      else{
        System.out.println("its not a strong no");
      }
    }
    public static int factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static boolean extract(int num)
   {
    int temp2=num;
    int temp;
    int sum=0;
    while(num!=0)
    {
        temp=num%10;
        sum+=factorial(temp);
        num/=10;

    }
    if(temp2==sum){
        return true;
    }
    else{
        return false;
    }
   }
}
