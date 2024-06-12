package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(-20);
        list.add(-1);
        list.add(0);
        list.add(-45);
        list.add(30);
        list.add(7);
        list.add(6);
        list.add(8);
        list.add(45);
        list.add(110);
        list.add(19);
        list.add(3);

        System.out.println(list);

//      Для использования бинарного поиска массив обязательно сортировать!
        Collections.sort(list);

        System.out.println(list);

        int index = Collections.binarySearch(list, 45);
        System.out.println(index);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Employee emp1 = new Employee(10, "Ivan", 1000);
        Employee emp2 = new Employee(1, "Zaur", 1251);
        Employee emp3 = new Employee(56, "Nikita", 100);
        Employee emp4 = new Employee(1, "Maria", 5000);
        Employee emp5 = new Employee(1, "Kolya", 1400);
        Employee emp6 = new Employee(47, "Ivan", 12345);
        Employee emp7 = new Employee(5, "Ivan", 800);

        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        listEmp.add(emp5);
        listEmp.add(emp6);
        listEmp.add(emp7);
        System.out.println(listEmp);

        Collections.sort(listEmp);

        System.out.println(listEmp);

        int index2 = Collections.binarySearch(listEmp, new Employee(1, "Kolya", 1400));

        System.out.println(index2);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another) {
        int result = this.id - another.id;
        if(result == 0){
            result = this.name.compareTo(another.name);
        }
        return result;
    }
}
