public class BouncyNo {
    public static void main(String[] args) {
        int num=98123;
        bouncy(num);
        
    }
    public static void bouncy(int num){
        int last=num%10;
        boolean inc=false,dec=false;
        while(num>9)
        {
            num/=10;
            int secondlast=num%10;
            if(last>secondlast){
                dec=true;
            }
            else if(secondlast>last){
                inc=true;
            }
            if(inc && dec){
                break;
            }
            else{
                last=secondlast;
            }

        }
        if(inc && dec){
            System.out.println("Its a Bouncy no");
        }
        else{
            System.out.println("Its not a Bouncy No");
        }
    }
    
}
