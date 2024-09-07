package LambdaExpressions;

public class Student {

    String name;
    int age;
    char sex;
    int course;
    double avrGrade;

    public Student(String name,int age, char sex, int course, double avrGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
