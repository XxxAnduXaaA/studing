import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("privet");
        list1.add("poka");
        String v1 = getSecond(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        int v2 = getSecond(list2);

        System.out.println(v1);
        System.out.println(v2);
    }

    public static <T> T getSecond(ArrayList<T> al) {
        return al.get(1);
    }
}


