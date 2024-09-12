import java.util.*;
class Atm{
    public static void main(String args[]){
        int balance=500;
        int Deposit,Withdraw;
        while(true){
        System.out.println("Hi Buddy! Welcome to Icici Bank Atm");
        System.out.println("Select your choice");
        System.out.println("Enter 1 Check Balance");
        System.out.println("Enter 2 Deposit");
        System.out.println("Enter 3 Withdraw");
        System.out.println("Enter 4 to Exit");
        
        Scanner sc=new Scanner(System.in);
        int Choice=sc.nextInt();
        
        switch(Choice){
        case 1:
              System.out.println("Account Balance: "+balance);
              break;
        case 2:
              System.out.print("Enter the Deposit Amount:");
              Deposit=sc.nextInt();
              balance=balance+Deposit;
              System.out.println("Total balance in Account:"+balance);
              break;         
        case 3:
              System.out.print("Enter the amount you want to withraw:");
              Withdraw=sc.nextInt();
              if(balance>=Withdraw){
              balance=balance-Withdraw;
              System.out.println("Please collect your cash");
              System.out.println("Your remaining balance is "+balance);              
              }
              else{
              System.out.println("Insufficent Balance");
              }
              break;
       default:
              System.out.println("Invalid response");
              System.exit(0);
         }}}}