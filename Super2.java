
public class Super2 {
    public static void main(String[] args) {
      child c1=new child();
        c1.details();
    }
}
class parent{
    String name="Lekhraj";


}
class child extends parent{
    String name="sandeep";
    void details()
    {
        System.out.println("my name is:"+name);
        System.out.println("Father name:"+super.name);
    }

}