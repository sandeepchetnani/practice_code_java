import java.util.ArrayList;

public class MoveZeros {
  
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,6};
        //int arr2[]=new arr2[]{arr.length};
        ArrayList<Integer> al=new ArrayList();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
             continue;
            }
            else{
                al.add(arr[i]);
            }
        }
       for(int list:al)
       {
        
       }     
     
   
    }
    
}