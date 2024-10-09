public class ExecptionHandlingTest {
    public static void main(String arg[]) {
        try {
            int i = 10 / 0;
            System.out.println("print thid i" + i);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("print Ar Exception");
        }
        catch(Exception e)
        {
           System.out.println("print Exception");
        }

    }
}
