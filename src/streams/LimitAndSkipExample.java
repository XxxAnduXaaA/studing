import java.util.ArrayList;
import java.util.List;

public class LimitAndSkipExample {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();

        Student s1 = new Student(1, "Vitaly", "Klichko", 3, 20, 2.5);
        Student s2 = new Student(105, "Mary", "Ivanova", 4, 24, 4.91);
        Student s3 = new Student(2, "Ivan", "Surgut", 1, 17, 4.1);
        Student s4 = new Student(4, "Petya", "Ivanchenko", 3, 19, 3.7);

        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s4);

        students1.stream().filter(e -> e.score < 3.8 && e.scholarship > 2).limit(1).forEach(System.out::println); //первый элемент
        students1.stream().filter(e -> e.score < 3.8 && e.scholarship > 2).skip(1).forEach(System.out::println); //второй элемент
    }
}
