import java.util.Collection;
import java.util.Collections;

public class PalindromeString {
    
    public static void main(String[] args) {
        String s="hih";
        String s1="";
        char[] ch=new char[s.length()];
        for(int i=ch.length-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        if(s1.equals(s))
        {
     System.out.println("palindrome");
        }
        else{
            System.err.println("not palindrome");
        }

    }
}
