import java.util.Arrays;

public class lcs {
    public static void main(String[] args) {
        int[] arr={16,89,100,200,20,4};
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i+1]-arr[i]==1)
            {
              count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
    
}
