package comporation.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("before sorting: ");
        System.out.println(list);
        System.out.println("after sorting: ");
        Collections.sort(list);
        System.out.println(list);
    }
}
