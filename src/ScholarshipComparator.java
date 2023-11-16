import java.util.Comparator;

public class ScholarshipComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.scholarship - o2.scholarship;
    }
}
