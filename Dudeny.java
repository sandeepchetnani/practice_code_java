public class Dudeny {
    public static void main(String[] args) {
        int ip=512;
        if(isdudeny(ip)){
            System.out.println("its a dudeny no");
        }
        else{
            System.out.println("its not a dudeny no");
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
