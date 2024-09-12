public class Sunny {
    public static void main(String[] args) {
        int ip=80;
        int flag=0;
        for(int i=1;i<ip;i++)
        {
            if(i*i==ip+1)
            {
               flag=1;
            }
           
        }
        if(flag==1){
        System.out.println("Its a Sunny No");
        }
        else{
            System.out.println("Its not a sunny");
        }
        
    }
    
}
