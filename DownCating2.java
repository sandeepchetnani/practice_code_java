public class DownCating2 {
    public static void main(String[] args) {
        cab c=new mini();
        cab c1=new sedan();
       
        System.out.println(((sedan)c1).price);
        System.out.println(((mini)c).price);
        System.out.println(cab.price);
    }
}
class cab{
  static int price=200;
}
class mini extends cab{
    int price=50;

}
class sedan extends cab{
int price=100;
}
