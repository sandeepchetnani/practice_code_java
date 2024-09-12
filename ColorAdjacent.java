import java.util.ArrayList;

public class ColorAdjacent {

    public static void main(String[] args) {
        
        int arr[]={2,0,2,1,1,0};
        ArrayList al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==0)
          {
             al.add(arr[i]);
          }
        }
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==1)
          {
             al.add(arr[i]);
          }
        }
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==2)
          {
             al.add(arr[i]);
          }
 
        }

        System.out.println(al);
       
    }
}