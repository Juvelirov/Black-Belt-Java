package syntax_pro.collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Элемент помимо ключа, значения, хэшкода, ссылки на следующий элемент, хранит дополнительно: ссылку на предыдущий добавленный в lhm и следующий добавленный в lhm.
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap(16, 0.75f, true);
        Student st1 = new Student("Artem", "Denisov", 3);
        Student st2 = new Student("Vasya", "Petrov", 2);
        Student st3 = new Student("Ivan", "Penisov", 1);
        Student st4 = new Student("Ignat", "Vereshko", 4);
        lhm.put(2.0, st1);
        lhm.put(3.0, st2);
        lhm.put(3.2, st3);
        lhm.put(4.1, st4);
        System.out.println("Добавление элементов по порядку: ");
        System.out.println(lhm);
        lhm.get(3.0);
        lhm.put(3.1, st2);
        System.out.println("После изменений: ");
        System.out.println(lhm);
    }
}
