public class ArrEx {
     public static void main(String[] args) {
        int num=1234;
        ArrEx a=new ArrEx();
        int arr[]=new int[a.count(num)];
        for(int i=0;i<arr.length;i++)
        {
            int temp=num%10;
            arr[arr.length-1-i]=temp;
            //arr[i]=temp;   reverse printing
            num=num/10;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }


     }
        
       int count(int num)
       {
        int count=0;
          while(num!=0)
          {
            count++;
            num/=10;
          }
          return count;
       }
    












}
