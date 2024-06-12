package collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Misha");
        arrayList1.add("Masha");
        arrayList1.add("Petya");
        //Exception: size:3, Index 4, так нельзя!
        //arrayList1.add(4,"Misha");

        //А так можно, так как теперь пустое место хоть чем то занимается
        arrayList1.add(null);
        arrayList1.add(4,"Misha");

//        System.out.println(arrayList1);

        arrayList1.set(3, "Vlad");

        System.out.println(arrayList1);

        arrayList1.add("Misha");

        System.out.println(arrayList1);

        //Удаляется только один элемент, а не все дубликаты
        arrayList1.remove("Misha");

        System.out.println(arrayList1);

    }
}
