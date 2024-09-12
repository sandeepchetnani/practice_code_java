public class RangeDudeny {
    public static void main(String[] args) {
        int start=1;
        int end=1000000;
        while(start<=end)
        {
            if(isdudeny(start))
            {
                System.out.println(start);
            }
            start++;
        }
        
    }
    public static boolean isdudeny(int num){
       return extract(num)==cube(num);

    }
    public static int cube(int num)
    {
        int cube=0;
     for(int i=1;i<num;i++){
    if(i*i*i==num){
        cube=i;
       break;
    }

    }
     return cube;

     
}
    public static int extract(int num){
        int ans=0;
       while(num!=0)
       {
   ans+=num%10;
   num/=10;
       }
       return ans;
    }
}