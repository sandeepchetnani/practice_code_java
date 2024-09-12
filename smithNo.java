public class smithNo {
    public static void main(String[] args) {
        int ip=4;
        if(isSmith(ip)){
            System.out.println("its a smith no");
        }
        else{
            System.out.println("its not a smith no");
        }
        
    }
    public static boolean isSmith(int num){
            return extract(num)==primeFactorization(num);
        }
       
    public static int primeFactorization(int num)
    {
        int ans2=0;
        int i=2;
        while(num>1){
           
                if(num%i==0){
                    ans2+=extract(i);
                    num/=i;
            
                }
                else{
                    i++;
                }
            
            
        }
        return ans2;

    }
    public static int extract(int num)
    {
        int ans=0;
        while(num!=0)
        {
         ans+=num%10;
         num/=10;
        }
        return ans;
    }
    

}
