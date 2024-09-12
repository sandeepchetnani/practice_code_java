/**
 * StringPanagram
 */
public class StringPanagram {

    public static void main(String[] args) {
        String s1="ABCDEFGAhIJKLMNOPQRSTUVWXYZ";
        if(isPanagram(s1)==true)
        {
         System.out.println("is a panagram no");
        }
        else{
            System.out.println("not a panagram");
        }
        


    }

    public static boolean isPanagram(String string)
    {

        boolean mark[]=new boolean[26];
        for(int i=0;i<string.length();i++)
        {
            int index=0;
            if(string.charAt(i)>='a' && string.charAt(i)<='z')
            {
               index=string.charAt(i)-'a';
            }
            else if(string.charAt(i)>='A' && string.charAt(i)<='Z')
            {
                index=string.charAt(i)-'A';
            }
            else
            {
                continue;
            }
            mark[index]=true;
        }
        for (int i = 0; i <=25; i++)  
         if (mark[i] == false)  
          return  (false);  
//if all characters were present  
        return (true);  
    }

}