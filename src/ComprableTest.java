import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComprableTest {
    public static void main(String args[])
    {
        ArrayList<Student> st=new ArrayList<Student>();
        st.add(new Student(1,"rashmi","Cse","2017"));
        st.add(new Student(5,"Akash","ec","2014"));
        st.add(new Student(6,"rohit","Civil","2018"));
        st.add(new Student(2,"pradeep","mba","2013"));

        Collections.sort(st);
        System.out.println("print after sorting");
        for(Student s1:st)
        {
            System.out.println(s1.getRollno()+","+s1.getName()+","+s1.getBatch()+","+s1.getDepartment());
        }
    }
}
