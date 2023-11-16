import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int res = o1.name.compareTo(o2.name);

        if(res == 0){
            res = o1.surname.compareTo(o2.surname);
        }

        return res;
    }
}
