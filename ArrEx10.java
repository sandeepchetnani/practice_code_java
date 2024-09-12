public class ArrEx10 {
    int[] arr={1,2,3,4};
    public static void main(String[] args) {
        ArrEx10 ae=new ArrEx10();
        ae.rev();
    }


    void rev(){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
              arr[i]=arr[i-1];

        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i]);
        }


    }
}
