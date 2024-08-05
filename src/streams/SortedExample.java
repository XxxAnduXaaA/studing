import java.util.ArrayList;
import java.util.List;
//Все потоки одноразовые

public class SortedExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "Vitaly", "Klichko", 3, 20, 2.5);
        Student s2 = new Student(105, "Mary", "Ivanova", 4, 24, 4.91);
        Student s3 = new Student(2, "Ivan", "Surgut", 1, 17, 4.1);
        Student s4 = new Student(4, "Petya", "Ivanchenko", 3, 19, 3.7);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        students = students.stream().sorted((a,b)-> a.scholarship - b.scholarship).toList();

        System.out.println(students);
    }
}

