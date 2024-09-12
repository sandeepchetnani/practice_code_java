public class Student extends Person{
    int sid;
    Student(){}
    Student(int sid,String name,double weight)
    {
        super(name, weight);
        this.sid=sid;
    }

    public static void main(String[] args) {
        Student s=new Student(123,"sandeep",70);
        System.out.println(s.weight);
    }

    S
    
}


//types of inheritance single level multiple multilevel hierarchical hyrid 
