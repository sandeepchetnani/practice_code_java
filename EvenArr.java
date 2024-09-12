class EvenArr {
    int arr[]={51,43,65,76,78};
    public static void main(String[] args) {
        EvenArr er=new EvenArr();
        er.isEven();

    }
    





     void isEven(){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }


    }

    
}
