package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


final class Student{
    final String name;
    final String surname;
    final Double grades;

    public Student(String name, String surname, Double grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, grades);
    }
}
public class HashCodeEx1 {



    public static void main(String[] args) {

        Student st1 = new Student("Nikita", "Nadysev", 4.1);
        Student st2 = new Student("Mariya", "Nekrasova", 3.7);
        Student st3 = new Student("Nikolay", "Morozov", 4.9);
        Student st4 = new Student("Darina", "Valyeva", 4.5);

        Map<Student, Integer> map = new HashMap<>();

        map.put(st1, 1);
        map.put(st2, 3);
        map.put(st3, 4);
        map.put(st4, 2);

        Student st5 = new Student("Darina", "Valyeva", 4.5);

        //При переопределении equals и hashcode!
        boolean f = map.containsKey(st5);
        System.out.println(f);

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());

    }

}
