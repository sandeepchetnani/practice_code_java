public class RangeHarshadNo {

    public static void main(String[] args) {
        int start=1;
        int end=100;
        while(start<=end){
            if(extract(start)){
                System.out.println(start);
            }
            start++;
        }
        
    }

    public static boolean extract(int num){
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

