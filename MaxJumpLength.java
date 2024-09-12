public class MaxJumpLength {
    
    public static void main(String[] args) {
        
        int arr[]={2,3,1,1,4};
        int flag=0;
        int i=1;
        i=i+arr[1];
       
        while(i<=arr.length-1)
        {
            if(i==arr.length-1)
            {
                flag=1;
                break;
            }
            else if(arr[i]==0)
            {
              flag=0;
              break;
            }
            
            else{
                i=arr[i]+i;
                
            }
        }
        if(i!=arr.length-1)
        {
            flag=0;
        }
        if(flag==0)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        
    }
}
