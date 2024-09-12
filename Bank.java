/**
 * Bank
 */
public class Bank {
    static long balance;
    static long accountno=123456789;
    static int pin=1234;

    public static void main(String[] args) {
        deposit(123456789, 1235, 100000);
        deposit(123456789, 1234, 100000);
        withdraw(123456789, 1234, -1000);

        

        
    }
    public static void withdraw(long accountno,int pin,int amt)
    {
       if(accountno==Bank.accountno && pin==Bank.pin && amt>0)
       {
        if(balance>amt)
        {
            balance=balance-amt;
            System.out.println("Withdraw successfull");
            System.out.println("Your Available Balance is"+balance);
        }
       }
       else{
        System.out.println("Incorrect details");
       }
    }
    public static void deposit(long accountno,int pin,int amt)
    {
        if(accountno==Bank.accountno && pin==Bank.pin && amt>0)
        {
        balance=balance+amt;
        System.out.println("Deposit successfull");
        System.out.println("Your Available Balance is"+balance);
        }
        else{
            System.out.println("Incorrect details");
           }
    }
}