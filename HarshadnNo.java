public class HarshadnNo {
    public static void main(String[] args) {
        int ip=24;
        if(isHarshad(ip)){
            System.out.println("it is a harshad");
        }
        else{
            System.out.println("not a harshad number");
        }
        
    }
    public static boolean isHarshad(int  num){
        int temp=num;
        int ans=0;
        while(num!=0){
            int rem=num%10;
            ans+=rem;
            num/=10;
        }
        return temp%ans==0;
    }
    
}
