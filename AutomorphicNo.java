import java.util.*;;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        automorphic(ip);
    }
    public static void automorphic(int num){
    int ct=count(num);
    int square=num*num;
    if(num==square%pow(10,ct)){
    System.out.println("its a automorphic no");
    }
    else{
        System.out.println("not a automorphic no");
    }

    }
    public static int count(int num){
        int count=0;
        while (num!=0) {
            count++;
            num/=10;
        }
        return count;
    }
    public static int pow(int base,int raise){
      int pow=1;
      for(int i=0;i<raise;i++){
      pow*=base;
      }
      return pow;
    }

}
