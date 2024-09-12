class Anagram
{
public static void main(String[] args) {
    int arr[] =new int[256];
    boolean flag=true;
    String str1="bbbaaAaa";
   String str2= "baabaaba";
   str1=str1.toLowerCase();
   str2=str2.toLowerCase();
    if(str1.length()!=str2.length())
    {
        System.out.print("not a anagram");
    }
    else{
        for(int i=0;i<str1.length();i++)
        {
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.print("its a anagram");
        }
        else{
            System.out.print("not a anagram");
        }
        
    }
  
 }
}