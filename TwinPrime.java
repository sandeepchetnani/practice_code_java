public class TwinPrime {
    public static void main(String[] args) {
        int num1=5;
        int num2=7;
        System.out.println(twinPrime(num1,num2));

    }
public static boolean twinPrime(int num1,int num2){  
    int prime1=num1;
    int prime2=num2;
    if(prime(prime1)&& prime(prime2) && prime2-prime1<=2)
    {
        return true;
    }
    else{
        return false;
    }



}


    public static boolean prime(int num)
    { int i;
        
        for(i=2;i<num;i++){
            if(num%i==0){
                break;
            }
        }
        if(num==i){
        return true;
        }
        else{
            return false;
        }
    }


}

