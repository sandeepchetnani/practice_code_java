public class BouncyNoRange {
    public static void main(String[] args) {
        int start=1;
        int end=200;
        while(start<=end)
        {
            if(bouncy(start)){
                System.out.println(start);
            }
            start++;
        }
        
    }
    public static boolean bouncy(int num){
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
           return true;
        }
       else{
        return false;
       }
    }

}
