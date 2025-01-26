package syntax_pro.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Artem", 3); // head (prev = null)
        Student2 st2 = new Student2("Matvey", 3);
        Student2 st3 = new Student2("Davyd", 3);
        Student2 st4 = new Student2("Julia", 1);
        Student2 st5 = new Student2("Vladislav", -1);
        Student2 st6 = new Student2("Igor", 100); // tail (next = null)
        LinkedList<Student2> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("Linked list = " + studentLinkedList);
        System.out.println(studentLinkedList.get(3)); //  Позиция элемента, индексов тут нет. Пробежка с head до 4 элемента через ссылки.
        studentLinkedList.add(1, st6);
        System.out.println("Linked list = " + studentLinkedList); // В случае вставки всего лишь меняются ссылки соседей. "Сдвигов" всего не происходит.
        studentLinkedList.remove(st2); // Удаление также просто меняем ссылки соседей. Очень быстро.
        System.out.println("Linked list = " + studentLinkedList); // Итог: поиск МЕДЛЕННЫЙ. Добавление и удаление - ОЧЕНЬ БЫСТРО.
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}