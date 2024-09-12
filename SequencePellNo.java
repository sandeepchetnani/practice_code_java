public class SequencePellNo {
    public static void main(String[] args) {

           isPell(5);
        
    }
    public static void isPell(int num)
    {
      int num1=0;
      int num2=1;
      System.out.println(num1);
      System.out.println(num2);
      for(int i=2;i<=num;i++){
      int num3=num2*2+num1;
        num1=num2;
        num2=num3;
        System.out.println(num3);
      }
    }
}
