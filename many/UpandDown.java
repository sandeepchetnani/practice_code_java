
class child extends parent{
  void m1(){
System.out.println("from child");
  }
}
class parent{
void m1()
{
System.out.println("from parent");
}
}
class UpandDown
{
    public static void main(String[] args) {
        parent p=new child();
        p.m1();
        
        child c=(child)p;
        c.m1();
        
    }
}