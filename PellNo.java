public class PellNo {
    public static void main(String[] args) {

           int ip=7;
          System.out.println(isPell(ip));
            
            

           }
        
    public static int isPell(int num)
    {
      int num1=0;
      int num2=1;
      int num3=0;
      for(int i=2;i<=num;i++){
        num3=num2*2+num1;
        num1=num2;
        num2=num3;
        
      }
      return num3;
    }
}