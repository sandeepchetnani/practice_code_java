public class Triangle {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=2;
        triangle(a, b, c);
        
    }
    public static void triangle(int x,int y,int z)
    {
      if(x==y && y==z)
      {
        System.out.println("Its a Equilateral Triangle");
      }
     else if(x==y || y==z || x==z)
     {
        System.out.println("Its a Isocelese triangle");
     }
     else{
        System.out.println("Its a Scalen Triangle");
     }
    }
}
