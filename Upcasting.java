class Upcasting{ 
    
    public static void main(String args[])
    {
    student s1=new student();
    Employee e1=new Employee();
      s1=e1;
    System.out.println(s1.name);
    System.out.println(e1.name+e1.id);
    
    }

}
class student {
    String name;

}
class Employee extends student{
    int id;
}