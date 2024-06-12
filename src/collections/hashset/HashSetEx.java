package collections.hashset;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("Nikita");
        hset.add("Pavel");
        hset.add("Kirill");
        hset.add("Michael");

        System.out.println(hset);

        hset.add("Michael");
        hset.remove("Pavel");

        System.out.println(hset);

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(123);
        set1.add(9);
        set1.add(4);
        set1.add(2);


        HashSet<Integer> set2 = new HashSet<>();

        set2.add(10);
        set2.add(123);
        set2.add(0);
        set2.add(8);
        set2.add(2);

        System.out.println(set1);
        System.out.println(set2);

        HashSet<Integer> union = new HashSet<>(set1);

        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(set1);

        intersection.retainAll(set2);
        System.out.println(intersection);

        HashSet<Integer> subtract = new HashSet<>(set1);

        subtract.removeAll(set2);
        System.out.println(subtract);


    }
}
