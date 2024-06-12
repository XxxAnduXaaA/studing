package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "Nikita");
        map1.put(20, "Masha");
        map1.put(3, "Dasha");
        map1.put(5, "Dasha");
//        map1.remove(5);
        map1.putIfAbsent(5, "Kirill");

        System.out.println(map1);
        System.out.println(map1.get(100));

        System.out.println(map1.containsKey(20));
        System.out.println(map1.containsValue("Dasha"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


        Map<Integer, String> map2 = new HashMap<>();

        map1.put(9, "Mariya");
        map1.put(40, "Katya");
        map1.put(2, "Gleb");
        map1.put(1, "Sergey");

        map1.putAll(map2);

        System.out.println(map1);


        //entry - пара ключ и значение, удобнее работать с содержимым мапы

       for(Map.Entry<Integer, String> e : map1.entrySet()){
           System.out.println(e);
       }


    }
}
