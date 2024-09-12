package OlaApp;
import java.util.Scanner;
public class OlaDriver {
    public static void main(String[] args) {
        Ola ola=new Ola();
        Scanner sc=new Scanner(System.in);
        System.out.println("----Welcome to ola app----");
        System.out.println("Select 1 for mini");
        System.out.println("select 2 for sedan");
        System.out.println("select 3 for Lux");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
             ola.bookCab(new Mini());
             break;   
            }
            case 2:
            {
                ola.bookCab(new Sedan());
                break;

            }
            case 3:
            {
               ola.bookCab(new Lux());
               break;
            }
            default:
            {
                System.out.println("enter a valid choice");
            }
        }

    }
}
