import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4);

        System.out.println(stream.distinct().peek(System.out::println).count());
        //Peek как forEach только не терминальный, удобен для отладки


    }
}
