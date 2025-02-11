package syntax_pro.collections.set_interface;

import java.util.HashSet;
import java.util.Set;

// Set - множество. Содержит уникальные значения.
// В основе HashSet лежит HashMap. В качестве ключей - значения set, в качестве значений - любые заглушки const, которые не играют никакой роли.
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        // set.add("Igor"); ошибки не будет, java просто проигнорирует добавление дубликата.
        // set.add(null); тк в основе hashset - hashmap, то ключи допускают null. Также можем добавить в set null.
        System.out.println(set);
        set.remove("Zaur");
        for (String s : set){
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));
        System.out.println(set.contains("Marina"));
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(5);
        hs1.add(2);
        hs1.add(3);
        hs1.add(1);
        hs1.add(8);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(7);
        hs2.add(4);
        hs2.add(3);
        hs2.add(5);
        hs2.add(8);

        HashSet<Integer> unionHs = new HashSet<>(hs1);
        // UNION - Объединение
        unionHs.addAll(hs2);
        System.out.println(unionHs);

        HashSet<Integer> intersectHs = new HashSet<>(hs1);
        // INTERSECT - Пересечение
        intersectHs.retainAll(hs2);
        System.out.println(intersectHs);

        HashSet<Integer> subtractHs = new HashSet<>(hs1);
        // SUBTRACT - Вычитание
        subtractHs.removeAll(hs2);
        System.out.println(subtractHs);
    }
}
