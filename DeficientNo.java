public class DeficientNo {
    public static void main(String[] args) {
        int ip=16;
        if(divisor(ip)<2*ip){
            System.out.println("its a deficient no");
        }
        else{
            System.out.println("its not a deficient no");
        }
        
    }
    public static int divisor(int num){
        int ans=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                ans+=i;
            }
        }
        return ans;
    }
}
