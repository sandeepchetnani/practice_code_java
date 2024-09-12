public class HailStone {
    public static void main(String[] args) {
        int num=7;
        System.out.println("The number of steps required is: "+isHailstone(num));
        
    
    }

  public static int isHailstone(int num)
  {
    int count=1;
    while(num!=1)
    {
        if(num%2==0){
           num=num/2;
           count++;
        }
        else{
            num=3*num+1;
            count++;
        }
    }
    return count;
  }

}
