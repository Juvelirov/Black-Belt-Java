package syntax_pro.collections.set_interface;

import java.util.LinkedHashSet;

// Наследник HashSet. Хранит в порядке добавления.
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(4);
        lhs.add(3);
        lhs.add(2);
        lhs.add(7);
        System.out.println(lhs);
        lhs.remove(3);
        System.out.println(lhs);
        System.out.println(lhs.contains(4));
    }
}
