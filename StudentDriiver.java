import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDriiver {
    public static void main(String[] args) {
      ArrayList<Student1> al=new ArrayList<>();
      al.add(new Student1(1,"sandeep",12));
      al.add(new Student1(4,"deep",11));
      al.add(new Student1(2,"manali",70));

      //with lambda function
      Collections.sort(al,(a,b)-> a.id-b.id);
      System.out.println(al);

      //directly
      Collections.sort(al,new Student1());

      //with anonymous class
       Collections.sort(al, new Comparator<Student1>() {
        @Override
        public int compare(Student1 s1,Student1 s2)
        {
            return s1.id-s2.id;
        }
     });
     System.out.println(al);

     // Collections.sort(al);
  System.out.println(al);

    }

    }
    
 