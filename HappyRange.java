class HappyRange
{
public static void main(String[] args)
{
    int start=1;
    int end=1000000;
    while(start<=end){
    int ans=isHappy(start);
    
    while (true) {
    if (ans==1) {
        System.out.println(start);
        break;
    }
    else{
        start=ans;
        ans=isHappy(start);
        
    }}
start++;}
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