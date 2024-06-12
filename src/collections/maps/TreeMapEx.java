package collections.maps;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

//        Ключи в TreeMap Уникальные! Сложность log(n) при поиске и вставке
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Nikita", "Nadysev", 4.1);
        Student st2 = new Student("Mariya", "Nekrasova", 3.7);
        Student st3 = new Student("Nikolay", "Morozov", 4.9);
        Student st4 = new Student("Darina", "Valyeva", 4.5);

        treeMap.put(st1.grades, st1);
        treeMap.put(st4.grades, st4);
        treeMap.put(st3.grades, st3);
        treeMap.put(st2.grades, st2);

        System.out.println(treeMap + "\n");
        System.out.println(treeMap.descendingMap() + "\n");

        //Выводит весь entry выше и ниже ключу
        System.out.println("headmap: " + treeMap.headMap(4.0) + "\n");
        System.out.println("tailmap: " + treeMap.tailMap(4.0) + "\n");

        //СТРОГО выше
        System.out.println("higher key: " + treeMap.higherKey(4.0));

        //СТРОГО ниже
        System.out.println("Lower key: " + treeMap.lowerKey(4.0));

        //БЛИЖАЙШЕЕ сверху значение
        System.out.println(treeMap.ceilingKey(4.0));

        //БЛИЖАЙШЕЕ снизу значение
        System.out.println(treeMap.floorKey(4.0));
        
    }
}
