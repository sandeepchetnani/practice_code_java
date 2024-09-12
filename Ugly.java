public class Ugly {
    public static void main(String[] args) {
        int ip=14;
        if(ugly(ip)){
            System.out.println("Its a Ugly No");
        }
        else{
            System.out.println("Its not a Ugly no");
        }
        
    }
    public static boolean ugly(int num)
    {
        while(num!=1){
              if(num%2==0){
                num/=2;
              }
              else if(num%3==0)
              {
                num/=3;
              }
              else if(num%5==0)
              {
                num/=5;
              }
             else{
                break;
             }

        }
    
        if(num==1){
            return true;
        }
        else{
            return false;
        }
    }

}
