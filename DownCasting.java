public class DownCasting {
    public static void main(String[] args) {
        parent p=new parent();
        System.out.println(p);
        parent p1=new child();
        child c= (child) p1;
        System.out.println(c);
    }
}
class parent{

}
class child extends parent{

}
