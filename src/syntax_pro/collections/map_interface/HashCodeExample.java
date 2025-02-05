package syntax_pro.collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Хэширование - преобразование любого объекта в int
// При переопределении equals нужно переопределить hashcode
public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Artem", "Denisov", 3);
        Student st2 = new Student("Vasya", "Petrov", 3);
        Student st3 = new Student("Ivan", "Penisov", 3);
        Student st4 = new Student("Artem", "Denisov", 3);
        map.put(st1, 5.0);
        map.put(st2, 4.4);
        map.put(st3, 3.2);
//        boolean result = map.containsKey(st4);
//        System.out.println("Result: " + result);
//        System.out.println("Equals?: " + st1.equals(st4));
        System.out.println("st1 hashcode: " + st1.hashCode());
        System.out.println("st2 hashcode: " + st2.hashCode());
        System.out.println("st4 hashcode: " + st4.hashCode());
        // У одинаковых объектов - ВСЕГДА одинаковый hashcode.
        // У разных объектов - может быть одинаковый hashcode (КОЛЛИЗИЯ).
        // Hashcode - ограничен значениями int (4 байта). А количество объектов не ограничено ничем. Это и есть главная причина коллизии.

    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
    }
}


