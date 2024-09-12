public class nqtex {
    public static void main(String[] args) {
        int arr[]={2,3,4,0,1,2,0,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==0)
          {
           count++;
          }
          else{
        int arr2=arr[i];
        System.out.print( arr2 +" ");
          }
        }
        for(int j=0;j<count;j++)
        {
            System.out.print(0+" ");
        }

    }

}
