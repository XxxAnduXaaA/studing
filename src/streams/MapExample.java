import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
//Все потоки одноразовые

public class MapExample {

    public static void main(String[] args) {
     List<String> list = new ArrayList<>();

     list.add("Haha");
     list.add("Hehehe");
     list.add("priv");
     list.add("ok");
     list.add("Partijano");

     List<Integer> list2 = new ArrayList<>();

//     for(String s : list){
//         list2.add(s.length());
//     }

     list2 = list.stream().map(e-> e.length()).collect(Collectors.toList());
//     list2 = list.stream().map(e-> e.length()).toList();

     System.out.println(list);

     System.out.println(list2);


     int[] array = {1,2,3,5,7,9};

     array = Arrays.stream(array).map(e
             ->{if (e % 2 != 0){
             e = e + 5;
             }
             return e;
             }
     ).toArray();

     System.out.println(Arrays.toString(array));

    }
}
