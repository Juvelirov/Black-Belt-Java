package syntax_pro.collections.queue_interface;



import java.util.Objects;
import java.util.PriorityQueue;

// Priority Queue использует элементы, учитывая приоритет. Кастомные объекты обязательно реализуют comparable. Приоритет в порядке сортировки от меньшего к большему. Слева направо.
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(10);
        pq.add(8);
        // 1 4 7 8 10 (слева направо уменьшается приоритет)
        System.out.println(pq.peek());
        System.out.println(pq.remove()); // Удаляется в порядке с высшего приоритета
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        Student st1 = new Student("Artem", 3);
        Student st2 = new Student("Vasya", 2);
        Student st3 = new Student("Petya", 1);
        Student st4 = new Student("Ivan", 4);
        Student st5 = new Student("Ivan", 3);
        PriorityQueue<Student> sq = new PriorityQueue<>();
        sq.add(st1);
        sq.add(st2);
        sq.add(st3);
        sq.add(st4);
        sq.add(st5);
        System.out.println(sq);
        System.out.println(sq.poll());
        System.out.println(sq.poll());
        System.out.println(sq.poll());
        System.out.println(sq.poll());
        System.out.println(sq.poll());

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
