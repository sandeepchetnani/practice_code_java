public class AdamNo {
    public static void main(String[] args) {
        int ip=14;
        int square=ip*ip;
        int reverse=reverse(ip);
        int squarereverse=reverse*reverse;
        if(square==reverse(squarereverse)){
            System.out.println("its a adam no");
        }
        else{
            System.out.println("Not a Adam No");
        }
        
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
