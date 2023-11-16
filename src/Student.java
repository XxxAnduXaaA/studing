
public class Student implements Comparable<Student>{
    int id;
    String name;
    String surname;
    int scholarship;


    public Student(int id, String name, String surname, int scholarship)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.scholarship = scholarship;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", scholarship=" + scholarship +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
