public class UglyNoRange {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        while(start<=end)
        {
        if(ugly(start)){
            System.out.println(start);
        }
        start++;
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

