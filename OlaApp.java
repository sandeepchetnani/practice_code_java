import java.util.Scanner;
public class OlaApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("------Welcome to ola App------");
       System.out.println("1. Mini");
       System.out.println("2. Sedan");
       System.out.println("Enter your choice");
       int choice=sc.nextInt();
       Cab c=null;
       switch(choice){
        case 1:
        {
          c=new Mini();
          break;
        }
        case 2:
        {
          c=new Sedan();
          break;
        }
        default:
        {
            System.out.println("invalid selection");
        }
       }
       if(c instanceof Mini){
        System.out.println("price per km"+((Mini)c).price);

       }
       else if(c instanceof Sedan)
       {
        System.out.println("price per km"+((Sedan)c).price);
       }
    }
}
