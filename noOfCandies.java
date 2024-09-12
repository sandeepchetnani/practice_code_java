/*
* noOfCandies
 */
public class noOfCandies {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        int count=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}