import java.util.Arrays;

public class majority {
    public static void main(String[] args) {
        int[] arr={1,1,3,4,1,1};
        Arrays.sort(arr);
        int length=arr.length/2;
        int temp=0;
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
                temp=arr[i];
            }
            else{
                if(count>length)
                {
                    System.out.println(temp);
                    count=0;
                    break;
                }
            }
        }
    }
}
