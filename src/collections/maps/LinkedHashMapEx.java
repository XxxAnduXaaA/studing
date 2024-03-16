package collections.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Nikita", "Nadysev", 4.1);
        Student st2 = new Student("Mariya", "Nekrasova", 3.7);
        Student st3 = new Student("Nikolay", "Morozov", 4.9);
        Student st4 = new Student("Darina", "Valyeva", 4.5);

        linkedHashMap.put(st1.grades, st1);
        linkedHashMap.put(st2.grades, st2);
        linkedHashMap.put(st3.grades, st3);
        linkedHashMap.put(st4.grades, st4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(4.1));
        System.out.println(linkedHashMap.get(4.5));

        System.out.println(linkedHashMap);
    }
}
