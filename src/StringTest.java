public class StringTest {
    public static void main(String[]args)
    {
        String str= "rashmi";
        String str1= new String("rashmi");
        String str4= new String("rashmi");
        String str2= new String("rashmi").intern();
        String str3= "Rashmi";
        System.out.println("by using == operator");
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str1==str4);
        System.out.println(str==str3);
        System.out.println(str1==str2);
        System.out.println("by using .equals method");
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str2));


    }
}
