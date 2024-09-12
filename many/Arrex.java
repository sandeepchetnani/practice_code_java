class Arrex
{

    {
        System.out.println("hi");
    }
    public static void main(String[] args) {
    
        Arrex m=new Arrex();
        Arrex n=new Arrex();
        Arrex s=new Arrex();

        Integer d=new Integer("10");
        int f=d;
    
        System.out.println(d);
        System.out.println(f);

        int[] a ={3,2,3,7,1,8,2,3};
        int val=3;
       
        int count=0;
        int j=0;
         for(int i=0;i<a.length;i++)
         {
            
            if(a[i]!=val)
            {
                a[j]=a[i];
                j++;
                count++;
            }
             
        }
        System.out.println(j);
           for(int i=0;i<j;i++) {
            System.out.print(a[i]);
           }
         }
        }
    