public class OverriderTest {
    void method(int a) {
        System.out.println("this is from integer method a" + a);
    }
    void method(double a) {
        System.out.println("this is from double method a" + a);
    }

}
class OverrideTest1 extends OverriderTest{
    @Override
    void method(double a){
        System.out.println("this is from double method b" + a);
    }
    public static void main(String args[]){
        new OverrideTest1().method(10.00);
    }
}
