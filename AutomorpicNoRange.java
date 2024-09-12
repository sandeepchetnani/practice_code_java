import java.util.*;
public class AutomorpicNoRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start of Range");
        int start=sc.nextInt();
        System.out.println("Enter the end of Range");
        int end=sc.nextInt();
        while (start<=end) {
            if(automorphic(start)){
                System.out.println(start);
            } 
            start++;
        }
        
    }
    public static boolean automorphic(int num){
    int ct=count(num);
    int square=num*num;
    if(num==square%pow(10,ct)){
        return true;
    }
    else{
        return false;
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


