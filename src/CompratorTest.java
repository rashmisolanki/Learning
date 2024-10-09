import java.util.ArrayList;
import java.util.Collections;

public class CompratorTest {
    public static void main(String args[])
    {
        ArrayList<Student> st=new ArrayList<Student>();
        st.add(new Student(1,"rashmi","Cse","2017"));
        st.add(new Student(5,"Akash","ec","2014"));
        st.add(new Student(6,"rohit","Civil","2018"));
        st.add(new Student(2,"pradeep","mba","2013"));

        Collections.sort(st, new NameComprator());
        System.out.println("print after sorting by name");
        for(Student s1:st)
        {
            System.out.println(s1);
        }


        Collections.sort(st, new RollNoComprator());
        System.out.println("print after sorting by rollno");
        for(Student s1:st)
        {
            System.out.println(s1);
        }
    }
}
