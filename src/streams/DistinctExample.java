import java.util.stream.Stream;
//Все потоки одноразовые

public class DistinctExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,1,4,5,2,7,3);

        stream.distinct().forEach(System.out::println);

    }
}
