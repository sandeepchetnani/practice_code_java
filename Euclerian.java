public class Euclerian {
    public static void main(String[] args) {
        System.out.println(isEuclerian(13245));
        
    }
    public static int isEuclerian(int num)
    {
            int count=0;
            int last=num%10;
            num/=10;
        while(num!=0)
        {
            int Secondlast=num%10;
            if(last>Secondlast)
            {
                count++;
            }
            last=Secondlast;
            num/=10;

        }
        return count;

    }
}
