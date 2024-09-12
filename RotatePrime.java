class RotatePrime
{
        public static void main(String[] args) {
        int ip=17;
        int temp=ip;
        if(isPrime(ip)){
        System.out.println(ip);
        ip=rotate(ip);
         while(temp!=ip){
            if(isPrime(ip)){
                
            System.out.println(ip);
            ip=rotate(ip);}
        
        }
        }
        
    }
    public static int pow(int base,int raise){
        int pow=1;
        for(int i=0;i<raise;i++){
            pow*=base;
        }
        return pow;
    }
    public static int count(int num){
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public static int rotate(int num){
            int rem=num%10;
            num=num/10;
            int ct=count(num);
            int ans=rem*pow(10,ct)+num;
            return ans;
    }
    public static boolean isPrime(int num)
    { int i;
        for(i=2;i<=num;i++){
            if(num%i==0){
                break;
            }
        }
        if(i==num){
         return true;
        }
        else{
           return false;
        }
    }
}