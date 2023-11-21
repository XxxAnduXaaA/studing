import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student std1 = new Student(1, "Sasha", "Tkachenko", 1000);
        Student std2 = new Student(500, "Abdul", "Tkachenko", 1500);
        Student std3 = new Student(140, "Sasha", "Nikiforof", 1000);

        list.add(std1);
        list.add(std2);
        list.add(std3);

        System.out.println("Do\n" + list);

        Collections.sort(list);

        System.out.println("Posle\n" + list);

        Collections.sort(list, new NameComparator());

        System.out.println("Posle\n" + list);

        Collections.sort(list, new ScholarshipComparator());

        System.out.println("Posle\n" + list);
    }
}