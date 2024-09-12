public class AdamNoRange {
    public static void main(String[] args) {
        int start=0;
        int last=100;
        while(start<=last)
        {
        int square=start*start;
        int reverse=reverse(start);
        int squarereverse=reverse*reverse;
        if(square==reverse(squarereverse)){
            System.out.println(start);
        }
        
        start++;
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

