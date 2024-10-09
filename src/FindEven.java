
import java.util.Arrays;
import java.util.List;

public class FindEven {
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(23,87,90,44,2,6,5,7);
        int even= num.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
      num.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println("even number"+even);
        num.stream().filter(n->n%2!=0).forEach(System.out::println);
        System.out.println("odd number"+even);
    }
}
