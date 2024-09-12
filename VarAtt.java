
public class VarAtt {
    
    public static void main(String[] args) {
        VarAtt v=new VarAtt();
       System.out.println(v.sum(1,2,3,4));
        
    }
     
    public int sum(int ...arr)
    {
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
        sum+=arr[i];
      }
      return sum;
    }
}
