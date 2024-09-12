
public class SuperClass {
    public static void main(String[] args) {
        child c=new child(12,"sandeep");
        System.out.println(c.id);
        System.out.println(c.name);
        
    }
    
}
class child extends parent{
    int id;
    
    child(){}
    child(int id,String name){
        super(name);
        this.id=id;

    }


}
class parent{
    String name;
    parent(){}
    parent(String name)
    {
        this.name=name;
    }


}