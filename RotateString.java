/**
 * RotateString
 */
public class RotateString {

    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder();
        String s1="amazon";
        int arr[]=new int[s1.length()];
        for(int i=s1.length();i>2;i++)
        {
            arr[i-2]=s1.charAt(i);
        }
        arr[arr.length-1]=s1.charAt(1);
        arr[arr.length-2]=s1.charAt(0);
       for (int i : arr) {
        System.out.println(i);
        
       }
    }
}