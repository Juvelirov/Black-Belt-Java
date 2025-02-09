package syntax_pro.collections.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

// TreeMap содержит в себе пары ключ-значение. Хранит данные в отсортированном по ключу виде. В основе лежит самобалансирующееся красно-чёрное дерево.
// Предназначение - нахождение каких-либо range (отрезков).
// В качестве ключа объекты должны имплементировать интерфейс Comparable (для понимания принципа сортировки компилятором). Либо использовать компаратор.
// Не является синхронизированной. Синхронизировать вручную.

public class TreeMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Artem", "Denisov", 3);
        Student st2 = new Student("Ivan", "Ivanov", 1);
        Student st3 = new Student("Evgeny", "Borisov", 2);
        Student st4 = new Student("Ignat", "Molozhaev", 1);
        Student st5 = new Student("Petr", "Sergeev", 4);
        Student st6 = new Student("Vasiliy", "Petrov", 3);
        Student st7 = new Student("Alexander", "Senegaev", 2);
        Student st8 = new Student("Alexander", "Senegaev", 2);
        TreeMap<Student, Double> treemap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.course == o2.course){
                    return o1.name.compareTo(o2.name);
                } else if (o1.course > o2.course) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
        treemap.put(st1, 5.2);
        treemap.put(st2, 5.7);
        treemap.put(st3, 8.2);
        treemap.put(st4, 2.2);
        treemap.put(st5, 5.5);
        treemap.put(st6, 1.2);
        treemap.put(st7, 2.1);
        System.out.println(treemap);
        treemap.remove(st3);
        System.out.println(treemap);
        System.out.println(treemap.descendingMap());
        System.out.println(treemap.tailMap(st5));
        System.out.println(treemap.headMap(st3));
        System.out.println(treemap.lastEntry());
        System.out.println(treemap.firstEntry());
        System.out.println(treemap.get(st8)); // Сравнение ключей по компаратору, если он не предоставлен - по equals.
    }
}


