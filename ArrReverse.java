import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        
    
    int arr[]={1,2,3,4};
    System.out.println(Arrays.toString(arr));
    int first=0;
    int last=arr.length-1;

    while(first<last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        last--;
        first++;
    }

    System.out.println(Arrays.toString(arr));
    }
}
