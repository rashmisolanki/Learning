import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hash= new HashMap<>();
        hash.put(1,"Rashmi");
        hash.put(2,"Rohit");
        hash.put(3,"mohit");
        hash.put(4,"mohiti");
        
        System.out.println("print ths hashmap"+hash);
        System.out.println("print ths hashmap values"+hash.values());
    }
}
