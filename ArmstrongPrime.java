public class ArmstrongPrime {
    public static void main(String[] args) {
        int ip=12;
        if(ArmStrongM.isArmstrong(ip))
        {
            if(Utility.prime(ip))
            {
                System.out.println("Its  a Armstrong Prime No");
            }
            else
            {
                System.out.println("Its a Armstrong but not a prime no");
            }
        }
        else{
            System.out.println("Its Not a ArmStrong No");
        }
    }
}
