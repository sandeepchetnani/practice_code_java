public class RangeSunny {
    public static void main(String[] args) {
        int start=1;
        int end=1000;
        while(start<=end)
        {
            if(issunny(start)){
                System.out.println(start);
            }
            start++;
        }
        
    }
    public static boolean issunny(int num)
    {
        int i=1;
        for(i=1;i<num;i++){
        if(num+1==i*i)
        {
            return true;
            
        }
        }
        
    }
}
