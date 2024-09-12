public class RecursiveCount {
    public static void main(String[] args) {
       count(123);
        
    }
    public static void count(int num)
    {
        int count=0;
      if(num!=0)
      {
        count++;
        count(num/10);
    }
     else{
        return ;
     }
   
}
}