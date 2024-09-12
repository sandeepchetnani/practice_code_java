/**
 * SphenicNo
 */
public class SphenicNo {

    public static void main(String[] args) {
        int ip=41;
        if(sphenic(ip)){
            System.out.println("its a sphenic no");
        }
        else{
            System.out.println("its not a sphenic no");
        }
        
    }
    public static boolean sphenic(int num)
    {
        int count=0;
        int ans=1;
        for(int i=2;i<num;i++)
        {
            if(isprime(i))
            {
            if(num%i==0)
            {
                ans*=i;
                count++;
            }
            }
            if(count==3){
                break;
            }
        }
        if(num==ans)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean isprime(int num)
    {
        if(num==0 ||num==1){
            return false;
        }
        else{
            int i=2;
            for(i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                   break; 
                }
            }
            if(num==i)
            {
                return true;
            }
            else{
                return false;
            }
        }
    }
}
