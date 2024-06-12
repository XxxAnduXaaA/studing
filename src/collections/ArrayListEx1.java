package collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //size - фактически занимаемый объём ArrayList
        //capacity - максимально возможный занимаемый объём ArrayList

        //Если заранее известно примерное количество элементов в ArrayList,
        //То рекомендуется задавать capacity

        List<String> list = new ArrayList<>(200);

        //Новый объект, который копирует элементы list
        List<String> list1 = new ArrayList<>(list);

        //Ссылка на объект, а не новый объект
        List<String> list2 = list;

        //output: False
        System.out.println(list == list1);

        //output: True
        System.out.println(list == list2);
    }
}
