class Happy
{
public static void main(String[] args)
{
    int ip=14;
    int ans=isHappy(ip);
    while (true) {
    if (ans==1) {
        System.out.println("its a happy no");
        break;
    }
    else if(ans==4){
{
    System.out.println("its not a happy no");
    break;
}
    }
    else{
        ip=ans;
        ans=isHappy(ip);
        
    }}

}
public static int isHappy(int num)
{
    int ans=0;
    while(num!=0){
 int temp=num%10;
   ans+=temp*temp;
   num/=10;
   
}
return ans;

}
}


