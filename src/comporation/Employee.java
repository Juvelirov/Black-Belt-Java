package comporation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<People> empList = new ArrayList<>();
        People emp1 = new People(20, 3, 80000, "Ivan", "Astafiev");
        People emp2 = new People(52, 1, 500000, "Evgeny", "Prigozhin");
        People emp3 = new People(20, 2, 180000, "Artem", "Denisov");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        System.out.println("Before sorting: \n" + empList);
        Collections.sort(empList);
        System.out.println("After sorting: \n" + empList);

    }
}

class People implements Comparable<People> {
    int age;
    String name;
    String surname;
    int id;
    int salary;

    public People(int age, int id, int salary, String name, String surname) {
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    // Возвращает целое число
    @Override
    public int compareTo(People anotherEmp) {
        if (this.id == anotherEmp.id){
            return 0;
        } else if (this.id < anotherEmp.id){
            return -1;
        }
        else {
            return 1;
        }
    }
}
