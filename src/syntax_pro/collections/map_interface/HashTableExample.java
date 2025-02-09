package syntax_pro.collections.map_interface;

import java.util.Hashtable;

// Работает, как и hashmap, но hashtable является synchronized, по этой причине методы работают медленнее. Устаревший класс.
// Ни ключ, ни значение не могут быть null.
// Современная альтернатива - ConcurrentHashMap.
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Artem", "Denisov", 3);
        Student st2 = new Student("Vasya", "Petrov", 2);
        Student st3 = new Student("Ivan", "Penisov", 1);
        Student st4 = new Student("Ignat", "Vereshko", 4);
        ht.put(5.0, st1);
        ht.put(2.0, st2);
        ht.put(3.0, st3);
        ht.put(4.0, st4);
        System.out.println(ht);
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println(ht.get(5.0));
    }
}
