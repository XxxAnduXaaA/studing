import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapToIntExample {

    //проводит операции над всеми числами - преобразует Integer в int для большей оптимизации

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(23);
        nums.add(53);
        nums.add(214);
        nums.add(9);

        int sum = nums.stream().mapToInt(e -> e).sum();
        int max = nums.stream().mapToInt(e -> e).max().getAsInt();
        int min = nums.stream().mapToInt(e -> e).min().getAsInt();
        double average = nums.stream().mapToInt(e -> e).average().getAsDouble();

        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
