import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args)
    {
        Map<Integer, String> st=new HashMap<>();
        st.put(1,"Rashmi");
        st.put(2,"Mohan");
        st.put(3,"Rohan");
        for(Map.Entry m1:st.entrySet())
        {
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
