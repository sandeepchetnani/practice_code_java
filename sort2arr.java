import java.util.ArrayList;

public class sort2arr {
    public static void main(String[] args) {
        
        int Arr1[]={1,2,3,5,6};
        int Arr2[]={0,3,6,20};
        ArrayList<Integer> l=new ArrayList<>();
        int i=0,j=0;

        while(i<Arr1.length && j<Arr2.length)
        {
            if(Arr1[i]>Arr2[j])
            {
                l.add(Arr2[j]);
                j++;
            }
            else{
                l.add(Arr1[i]);
                i++;
            }

        }
        if(i<Arr1.length)
        {
            l.add(Arr1[i]);
        }
        if(j<Arr2.length)
        {
           l.add(Arr2[j]);
        }

               
                 
                    System.out.println(l);   
        

    }
}
