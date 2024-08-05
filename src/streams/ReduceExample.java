import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//Все потоки одноразовые

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        int result = integers.stream().reduce((accum, num) ->
                accum * num).get();
        // 1,2,3,4,5
        //accum = 1 2 6 24 120
        //nun =   2 3 4 5

        System.out.println(result);

        List<Integer> listNull = new ArrayList<>();
//        listNull.add(5);
//        Optional<Integer> resultNull = listNull.stream().reduce((accum, num) -> accum*num);
        int resultNull = listNull.stream().reduce(1, (accum, num) -> accum*num); //не вызовет исключения даже при null

        System.out.println(resultNull);


        List<String> words = new ArrayList<>();

        words.add("Privet");
        words.add("kak");
        words.add("dela?");
        words.add("bb");

        String result2 = words.stream().reduce((accum, num) -> accum+" "+num).get();
        System.out.println(result2);
    }
}
