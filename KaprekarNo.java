public class KaprekarNo {
    public static void main(String[] args) {
        int ip=1;
        if(iskaprekar(ip)){
            System.out.println("its a kaprekar no");
        }
        else{
            System.out.println("not a kaprekar no");
        }
        
    }
    public static boolean iskaprekar(int num){
        int temp=num;
        num=num*num;
        int ans=0;
        if(num==1){
            return true;
        }
        if(count(num)%2==0){
        int rem=num%power(10,count(num)/2);
        num=num/power(10,count(num)/2);
        ans=rem+num;
           
        }
         return ans==temp;
    }
    public static int count(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
           return count;
    }
    public static int power(int base,int raise){
        int pow=1;
        for(int i=0;i<raise;i++){
            pow*=base;

        }
        return pow;
    } 
}
