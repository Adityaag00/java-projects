import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,4,5,6,7);
        System.out.println(list.stream().filter(i-> i%5==0).map(i-> {
            System.out.println("test1     "+i); return i*=2;
        }).findFirst());
    }
}
