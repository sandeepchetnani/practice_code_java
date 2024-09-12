import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
public class ReverseString {
    public static void main(String[] args) {
        String str="my name is sandeep";
        String str2="";
        StringBuilder sb=new StringBuilder();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
              str2+=str.charAt(i);
            }
            else
            {
              stack.push(str2);
              str2="";
            }
        }
        stack.push(str2);
        str2="";
        while(!stack.isEmpty())
        {
         sb.append(stack.pop()+" ");
        }
        System.out.println(sb);
       
       //String[] a=str.split(" ");
       //Collections.reverse(Arrays.asList(a));
       //for (String string : a) {
        //System.out.print(string+" ");   
        //}
        //System.out.println(str.join(" ",a));
    }
}

//if n==1,2 
//for(i=2;length n++) if(n%i==0) return fale else true  