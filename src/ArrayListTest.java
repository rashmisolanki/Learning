import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(67);
        list.add(78);
        list.add(5);
        list.add(20);
        list.set(3,40);

        System.out.println("print the array list:"+list);
        //sort this list
        Collections.sort(list);
        System.out.println("after the revers oder");
        Collections.sort(list, Collections.reverseOrder()) ;
        System.out.println("Iterator the array list");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Travers list by using for each loop");
        for(Integer num:list)
        {
            System.out.println(num);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(4);
        list1.add(8);
        list1.add(100);

        System.out.println("print the array list1:"+list1);
        list1.addAll(list);

        System.out.println("merger the array list1:"+list1);
        list.forEach(num->System.out.println(num));
    }
}
