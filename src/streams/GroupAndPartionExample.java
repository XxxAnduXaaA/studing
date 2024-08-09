import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAndPartionExample {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "Vitaly", "Klichko", 3, 20, 2.5);
        Student s2 = new Student(105, "Mary", "Ivanova", 4, 24, 4.91);
        Student s3 = new Student(2, "Ivan", "Surgut", 1, 17, 4.1);
        Student s4 = new Student(3, "Petya", "Ivanchenko", 3, 19, 3.7);
        Student s5 = new Student(4, "Elizabeth", "Watson", 2, 19, 2.7);
        Student s6 = new Student(5, "Gleb", "Matveenko", 2, 18, 4.7);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        Map<Integer, List<Student>> map = students.stream().map(e -> {
            e.setName(e.addToName(e.getName()));
            return e;
        }) .collect(Collectors.groupingBy(e -> e.getScholarship()));

        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Boolean, List<Student>> map1 = students.stream().collect(Collectors.partitioningBy(e -> e.getScore() > 4));
        for(Map.Entry<Boolean, List<Student>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
