import javax.jws.soap.SOAPBinding;

/**
 * EvilNo
 */
public class EvilNo {
    public static void main(String[] args) {
        int ip=23;
        if(isEvil(ip)%2==0){
            System.out.println("Its a Evil No");
        }
        else{
            System.out.println("Not a Evil No");
        }
        
    }
    public static int isEvil(int num)
    {
        int count=0;
        while(num!=0)
        {
     if(num%2==1)
     {
        count++;

     }
     num/=2;
    }
     return count;
     
    }


}