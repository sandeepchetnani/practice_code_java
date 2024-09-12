public class ArrayManager {
    void modifyArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
         arr[i]*=2;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        ArrayManager m=new ArrayManager();
        m.modifyArray(myArray);
        for(int i=0;i< myArray.length;i++)
        {
           System.out.print(myArray[i]+" ");
        }
    }
}
