package collections.maps;



import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        Student st1 = new Student("Nikita", "Nadysev", 4.1);
        Student st2 = new Student("Mariya", "Nekrasova", 3.7);
        Student st3 = new Student("Nikolay", "Morozov", 4.9);
        Student st4 = new Student("Darina", "Valyeva", 4.5);

        map.put(st1, 1);
        map.put(st2, 2);
        map.put(st3, 3);
        map.put(st4, 4);

        System.out.println(map.containsKey(st1));

//        Объект в качестве ключа должен быть immutable, неизменяемым, чтобы не менялась хэшсумма
//        и не было ошибок в коде при проверке наличия элемента
//        st1.grades = 3.0;
//        System.out.println(map.containsKey(st1));
    }
}
