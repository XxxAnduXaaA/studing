import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
//Все потоки одноразовые

public class FilterExample {

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

        students1 = students1.stream().filter(e -> e.score < 3.8 && e.scholarship > 2).collect(Collectors.toList());

        System.out.println(students1);
    }
}


class Student {
    int id;
    String name;
    String surname;
    int scholarship;
    int age;
    double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int id, String name, String surname, int scholarship, int age, double score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.scholarship = scholarship;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", scholarship=" + scholarship +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
