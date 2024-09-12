import java.util.*;
class reverseWordsStirng
{
    public static void main(String[] args) {
        
        String str="the sky is blue";
        String[] arr=str.split(" ");
         Collections.reverse(Arrays.asList(arr));
         for (String string : arr) {
            System.out.print(string+" ");
         }

    }
}