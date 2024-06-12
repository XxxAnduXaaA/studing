package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Удобно использовать при условии для удаления элемента в листе
        Iterator<Integer> Ilist = list.iterator();
        while (Ilist.hasNext()){
            System.out.println(Ilist.next());
        }
//        Для оставшихся элементов применяет некую операцию
//        В данном случае - вывод
//        Ilist.forEachRemaining(integer -> System.out.println(integer));
    }
}
