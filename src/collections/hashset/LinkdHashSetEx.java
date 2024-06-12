package collections.hashset;

import java.util.LinkedHashSet;

public class LinkdHashSetEx {
    public static void main(String[] args) {
//        Отличие от LinkedHashMap в том, что он урезан. Хранит только информацию о добавлении,
//        В качестве значения заглушка
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(10);
        lhs.add(8);
        lhs.add(5);
        lhs.add(6);
        lhs.add(3);

        System.out.println(lhs);
    }
}
