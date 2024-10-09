import java.util.*;

public class ArraySortingTest {
    public static void main(String[] args)
    {
        List<Student> st1=new ArrayList<>();
        st1.add(new Student(100,"rashmi","bse","2013"));
        st1.add(new Student(102,"pradeep","B.tech","2011"));
        st1.add(new Student(105,"Akash","Msc","2015"));
        st1.add(new Student(101,"Rohit","BA","2014"));
        st1.add(new Student(103,"Sam","B.tech","2013"));
        Collections.sort(st1);
        Iterator its=st1.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }
    }
}
