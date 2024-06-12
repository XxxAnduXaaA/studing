package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4.35, 'm', 1);
        Student st2 = new Student("Maria", 3.35, 'w', 4);
        Student st3 = new Student("Nikita", 4.51, 'm', 3);
        Student st4 = new Student("Pavel", 2.94, 'm', 2);
        Student st5 = new Student("Andrey", 4.35, 'm', 1);

        //Если тут задать st6 = st5, то получится ссылка на объект st5, тогда элемент удалится
        //Т.к идёт ссылка на один объект
        Student st6 = new Student("Andrey", 4.35, 'm', 1);

        List<Student> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);

//        studentList.remove(st5);
        studentList.remove(st6);

        //Ничего не удалится, так как по стандарту метод equals проверяет ссылку на один и тот же объект в памяти
        //Требуется переопределить метод
        System.out.println(studentList);
    }
}

class Student{
    private String name;
    private double avrGrade;
    private char sex;
    private int course;

    public Student(String name, double avrGrade, char sex, int course) {
        this.name = name;
        this.avrGrade = avrGrade;
        this.sex = sex;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avrGrade=" + avrGrade +
                ", sex=" + sex +
                ", course=" + course +
                '}';
    }
// Переопределение метода equals, после него идёт корректное сравнение объектов класса Student
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Double.compare(student.avrGrade, avrGrade) == 0 &&
//                sex == student.sex && course == student.course &&
//                Objects.equals(name, student.name);
//    }

}
