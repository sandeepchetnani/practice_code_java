public class FasinatingRange {

    public static void main(String[] args) {
        int start=1;
        int end=1000;
        while (start<=end) {
            if(facinating(start)){
            System.out.println(start);
            }
            start++;
        }
        
    }
    public static boolean facinating(int num){
       
        int num1=0,num2=0;
        if(num>=3){
            
            num1=(num*pow(10,count(num)))+num*2;
            num2=(num1*pow(10,count(num)))+num*3;


        }
        return isunique(num2);     //return num2;

    }
    public static boolean unique(int num){
        int count=0;
        while (num!=0) {
            int temp=num/10;
            while(temp!=0)
            {
             if(num%10==temp%10){
                count=1;
                break;
             }
             temp/=10;
            }
            num/=10;
        }
        return count==0;
       
    }
    public static int count(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int pow(int base,int raise){
        int pow=1;
        for(int i=0;i<raise;i++){
            pow*=base;
        }
        return pow;
    }
    public static boolean isunique(int num)
    {
        int count=0;
        while (num!=0) {
            int temp=num/10;
            while(temp!=0)
            {
             if(num%10==temp%10){
                count=1;
                break;
             }
             temp/=10;
            }
            num/=10;
        }
        if(count==1){

            return false;
        }
        else{
           return true;
        }
    }
    }