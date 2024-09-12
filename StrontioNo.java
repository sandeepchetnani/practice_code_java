public class StrontioNo {
    public static void main(String[] args) {
        int ip=1232;
        
        if(count(ip)==4){
            ip=ip*2;
             ip/=10;
             int num1=ip%10;
             ip/=10;
             int num2=ip%10;
             if(num1==num2){
                System.out.println("its a strontio no");
             }
             else{
                System.out.println("Not a Strontion No");
             }
        }
        else{
            System.out.println("not a strontio no");
        }
    }
    public static int count(int num)
	{
	int count =0;
	while(num!=0){count++;
	num/=10;
	}
	return count;
	}

}
