package OlaApp.Amazon;
import java.util.Scanner;
public class AmazonDriver {
    public static void main(String[] args) {
        Amazon amazon=new Amazon();
        Scanner sc=new Scanner(System.in);
        System.out.println("----Welcome to Amazon----");
        System.out.println("Enter 1 for medicine");
        System.out.println("Enter 2 for electronics");
        System.out.println("enter 3 for Food");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            {
               amazon.doOrder(new Medicine());
               break;
            }  
            case 2:
            {
                amazon.doOrder(new Electronic());
                break;

            }
            case 3:
            {
                amazon.doOrder(new Food());
                break;
            }
            default:
            {
                System.out.println("please select a valid option");
            }
               
        }
    }
    
}
