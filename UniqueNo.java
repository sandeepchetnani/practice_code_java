import java.util.Scanner;
public class UniqueNo {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ip=sc.nextInt();
        unique(ip);
    }
    public static void unique(int num)
    { 
        int count=0;
        while (num!=0) {
            int temp=num/10;
            while(temp!=0)
            {
             if(num%10==temp%10){
                count=1;
                break;
             }
             temp/=10;
            }
            num/=10;
        }
        if(count==1){

            System.out.println("Not a unique no");
        }
        else{
            System.out.println("its a unique no");
        }
    }

}
