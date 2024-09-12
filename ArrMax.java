import java.util.Scanner;
public class ArrMax {
      
    Scanner sc=new Scanner(System.in);

    
    public static void main(String[] args) {
        ArrMax a=new ArrMax();
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(a.FindMax(arr));

}

    int FindMax(int arr[]){
         int max=0;
         for(int i=0;i<arr.length;i++)
         {
            for(int j=1;j<arr.length-1
            ;j++)
            {

                if(arr[i]<arr[j])
                {
                   max=arr[j];
                }
                else{
                    max=arr[i];
                }
            }

            
         }
         return max;
    }
}
