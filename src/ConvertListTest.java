import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListTest {
    public static void main(String[] args)
    {
        List<String> str=new ArrayList<>();
        str.add("rashmi");
        str.add("pradeep");
        str.add("mohan");
        System.out.println("print before List to Array"+str);
        String[] arr=str.toArray(new String[str.size()]);
        System.out.println("print After List to Array"+Arrays.toString(arr));
        List<String> converttoList=new ArrayList<>();
        for(String con:arr)
        {
            converttoList.add(con);
        }
        System.out.println(converttoList);

    }
}
