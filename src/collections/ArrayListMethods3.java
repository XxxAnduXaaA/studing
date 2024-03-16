package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
//        Возникнет ошибка, так как в одном случае используется примитивный тип, а в другом обёртка
//        int[] array = {0,1,2,3};
//        List<Integer> list = Arrays.asList(array);

        Integer[] array = {0, 1, 2, 3};
        List<Integer> list = Arrays.asList(array);

        System.out.println(list);

        array[0] = 2;
//        Так делать нельзя! Потому что лист в данном случае выступает только представлением
//        И конкретно это представление не может модифицироваться
//        list.add(4);

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Maria");
        list1.add("Andrey");
        list1.add("Nikita");
        list1.add("Pavel");
        list1.add("Matvey");
        list1.add("Misha");

        System.out.println(list1);

//        List<String> list2 = new ArrayList<>();
//        list2.add("Maria");
//        list2.add("Pavel");
//        list2.add("Misha");
//
//        //Оставляет те элементы, которые есть в другом листе. Метод обратен remove
//        list1.retainAll(list2);

        // последний индекс не включительно
        // Этот лист тоже является представлением, но он может модифицироваться
        // Также взаимодействие с List1 теперь производится только через него, как прослойку
        List<String> list2 = list1.subList(1,4);

//        System.out.println(list1);

        System.out.println(list2);

        list2.add("Vitaliy");

//        Вызовет исключение
//        list1.add("Kolya");

        //Данный список будет неизменяемым
        List<Integer> list3 = List.of(1,2,3);
        //Существует ещё аналог List.copyOf


        System.out.println(list2);
        System.out.println(list1);




    }
}
