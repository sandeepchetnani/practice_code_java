public class SumArr {
    int a[]={1,2,3,4,5,6};
    public static void main(String[] args) {
        SumArr sum=new SumArr();
        System.out.println(sum.SumArr());
    }


    int SumArr(){
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
}
