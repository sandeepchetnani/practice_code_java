import java.util.*;
public class IntersectionArr {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={2,6,7};
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++)
        {
            if(set.contains(arr2[j]))
            {
              count++;
              System.out.println(arr2[j]);
              set.remove(arr2[j]);
            }
        }
        System.out.println(count);

    }
}
