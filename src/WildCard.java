import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Integer> list = new ArrayList<Number>();
        List<Double> list = new ArrayList<>();

        list.add(3.14);
        list.add(3.15);
        list.add(3.16);


        List<?> anyList = new ArrayList<String>();
//        anyList.add("Hi");
    }

    static void showInfo(List<?> list){
        System.out.println("Elementy lista: " + list);
    }
}
