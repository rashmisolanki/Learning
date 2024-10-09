public class ReverseString {

    public static String reverseStr(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args)
    {
        String s1 = "my name is rashmi";
       System.out.println(reverseStr(s1));
    }
}
