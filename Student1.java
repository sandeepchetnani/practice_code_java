import java.util.Comparator;
public class Student1 implements Comparator<Student1>{
    int id;
    String name;
    int age; 
    @Override
    public int compare(Student1 s1,Student1 s2)
    {
        return s1.id-s2.id;
    }
    public Student1()
    {
    }
    public  Student1(int id,String name,int age)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String toString()
    {
        return name+" "+age+" "+id;
    }

}
