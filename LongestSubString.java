import java.util.*;
public class LongestSubString {
    
    public static void main(String[] args) {
        String s="sandeep";
        String longestsubString=null;
        int length=0;
        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
             char ch=arr[i];
             if(!map.containsKey(ch))
             {
                map.put(ch,i);
             }
             else{
                i=map.get(ch);
                map.clear();
             }
             if(map.size()>length)
             {
                length=map.size();
                longestsubString=map.keySet().toString();

             }
        }
  System.out.println(longestsubString);
  System.out.println(length);

    }
}
