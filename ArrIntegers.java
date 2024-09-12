import java.util.ArrayList;

public class ArrIntegers {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        ArrayList al=new ArrayList<>();
    
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==target)
           {
            al.add(i);
           }
        }
        if(!al.isEmpty())
        {
          System.out.println("["+al.get(0)+" "+al.get(al.size()-1)+"]");
        }
        else{
             System.out.println("[-1,-1]");
        }
    }
}
