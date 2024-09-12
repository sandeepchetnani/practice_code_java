class XylemNo {
    public static void main(String[] args) {
        int ip=1624;
        int ans=0;
        if(count(ip)>=3){
            int num=ip%10;
            ip/=10;
            while(ip>=9){
             ans+=ip%10;
             ip/=10;
            }
            num+=ip;
            if(num==ans){
                System.out.println("its a xylem no");
            }
            else{
                System.out.println("its apholem no");
            }
        }
    }
    

public static int count(int num)
{
    int count=0;
    while(num!=0){
        count++;
        num/=10;
    }
    return count;
}
}