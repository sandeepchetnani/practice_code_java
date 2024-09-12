public class LycherelNo {
    public static void main(String[] args) {
        int ip=395;
        if(lycherel(ip)){
            System.out.println("its a lycherel no");
        }
    else{
        System.out.println("its not a lycherel no");
    }
    }
    public static boolean lycherel(int num)
    { 
        int temp=num;
        for(int i=1;i<50;i++){
         int reverse=reverse(temp);
         int sum=temp+reverse;
        if(sum==reverse(sum)){
            return false;
        }
        temp=sum;


        }
        return true;

    }
    public static int reverse(int num)
    { 
        int num2=0;
        while(num!=0){
            num2=(num2*10)+num%10;
            num/=10;
        }
        return num2;
    }

}
