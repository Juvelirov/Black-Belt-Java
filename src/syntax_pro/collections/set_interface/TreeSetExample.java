package syntax_pro.collections.set_interface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// В основе TreeSet лежит TreeMap. Ключи - значения множества. Значения - заглушки.
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        System.out.println(set);
        set.remove(9);
        System.out.println(set);
        System.out.println(set.contains(2));

        Student st1 = new Student("Artem", 3);
        Student st2 = new Student("Vasya", 2);
        Student st3 = new Student("Petya", 1);
        Student st4 = new Student("Ivan", 4);
        Student st5 = new Student("Ivan", 3);
        TreeSet<Student> studentSet = new TreeSet<>();
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        System.out.println(studentSet);
        System.out.println(studentSet.first());
        System.out.println(studentSet.last());
        System.out.println(studentSet.headSet(st3));
        System.out.println(studentSet.tailSet(st4));
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent){
        return this.course - otherStudent.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
