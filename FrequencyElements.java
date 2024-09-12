import java.util.*;
public class FrequencyElements {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,1,1,1};
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
        if(map.containsKey(arr[i]))
        {
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }

    }
    for (int i : map.keySet()) {
         if(map.get(i)>n/2)
         {
           System.out.println(i);
         }
    }
    }
}
