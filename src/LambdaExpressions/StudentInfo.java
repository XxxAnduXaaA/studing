package LambdaExpressions;

import java.util.ArrayList;

public class StudentInfo {


//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avrGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avrGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Nikolai", 20, 'm', 3, 4.64);
        Student st2 = new Student("Maria", 19, 'f', 2, 4.12);
        Student st3 = new Student("Gregory", 18, 'm', 3, 4.64);
        Student st4 = new Student("Michail", 21, 'm', 4, 3.25);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        StudentInfo info = new StudentInfo();
//        info.printStudentOverGrade(students, 4.16);
//        info.printStudentUnderAge(students, 20);
//        info.printStudentsMixCondition(students, 19, 4.12, 'f');


    }
}
