class NoofWordinString
{
    public static void main(String[] args) {
        String str="hi my name is sandeep";
        System.out.println(count(str));
    }
    public static  int count(String str)
    {
        int count=0;
        if(str.charAt(0)!=' ')
        {
            count++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' )
            {
                count++;
            }
        }

        return count;
    }
    
}