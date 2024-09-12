public class longestSubSequenceCount {
    
    public static void main(String[] args) {

        String s1="sandeepsndjnd";
        String s2="djnjenwesandeepkk";
        System.out.println(count(s1,s2));

        
    }

    public static int count(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        String s3="";
        
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int curr=0;
                s3="";
                while((i+curr)<n && (j+curr)< m && s1.charAt(i+curr)==s2.charAt(j+curr))
                {
                    s3+=s1.charAt(i+curr);
                    curr++;
                    
                }
                res=Math.max(res, curr);
               
            }
           
        }
        System.out.println(s3);
        return res;
    }
}
