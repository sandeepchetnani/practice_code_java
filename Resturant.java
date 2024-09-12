import java.util.Scanner;
class Resturant
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("**Welcome to the Sandeep Resturant**");
  System.out.println("For vegiterian Enter V");
  System.out.println("For Non-vegiterian Enter N");
  char c=sc.next().charAt(0);
  switch(c)
  {
  case 'V':
  {
   System.out.println("Enter 1 for poha");
   System.out.println("Enter 2 for idli");
   System.out.println("Enter 3 for panner");
   System.out.println("Enter 4 for mushroom");
   int menu=sc.nextInt();
      switch(menu)
      {
      case 1:
      {
      System.out.println("Price of poha is 30 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" poha is "+(qty*30));
      break;
      }
      case 2:
      {
      System.out.println("Price of idli is 30 Rs"); 
       System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" idli is "+(qty*30));
      break;
      }
      case 3:
      {
      System.out.println("Price of panner is 210 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" panner is "+(qty*210));
      break;
      }
      case 4:
      {
      System.out.println("Price of mushroom is 180 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" mushroom is "+(qty*180));
      break;
      }
      default:
      {
      System.out.println("Invalid input please check the menu again");
      }
      }
      break;
  }    
  case 'N':
  {
   System.out.println("Enter 1 for chicken");
   System.out.println("Enter 2 for mutton");
   System.out.println("Enter 3 for fish");
   System.out.println("Enter 4 for prawns");
   int menu=sc.nextInt();
      switch(menu)
      {
      case 1:
      {
      System.out.println("Price of chicken is 200 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" chicken is "+(qty*200));
      break;
      }
      case 2:
      {
      System.out.println("Price of mutton is 400 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" mutton is "+(qty*400));
      break;
      }
      case 3:
      {
      System.out.println("Price of fish is 300 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" fish is "+(qty*300));
      break;
      }
      case 4:
      {
      System.out.println("Price of prawns is 250 Rs"); 
      System.out.println("Enter the qty to order");
      int qty=sc.nextInt();
      System.out.println("Total bill for "+qty+" prawns is "+(qty*250));
      break;
      }
      default:
      {
      System.out.println("Invalid input please check the menu again");
      }
      }
      break;
   }

     default:
     {
     System.out.println("From which planet you are from");
     }
}

}
}