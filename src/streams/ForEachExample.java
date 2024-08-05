import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//Все потоки одноразовые

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(8);

//        list.stream().forEach(e -> System.out.println(e));
        list.stream().forEach(System.out::println);
        list.stream().forEach(Utils::someMethod);

        System.out.println("\n\n");

        Stream<Integer> stream = Stream.of(2,5,10,8,9);
        stream.forEach(Utils::someMethod);



    }

}

class Utils{
    static void someMethod(int x){
        System.out.println("Element = " + (x+11));
    }
}
