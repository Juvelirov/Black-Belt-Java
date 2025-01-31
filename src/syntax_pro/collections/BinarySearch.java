package syntax_pro.collections;

import syntax_pro.comporation.People;
import syntax_pro.comporation.comparable.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


// Collections - class с полезными методами, Collection - interface от Iterable
public class BinarySearch {
    // Бинарный поиск работает в отсортированных коллекциях.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-1);
        list.add(52);
        list.add(-14);
        list.add(256);
        Collections.sort(list);
        int index = Collections.binarySearch(list, 52);
        System.out.println("Element: " + 52);
        System.out.println("Index: " + index);
        System.out.println("List: " + list);
        People emp1 = new People(18, 1, 1000, "Ivan", "Ivanov");
        People emp2 = new People(22, 2, 1250, "Alexander", "Borodin");
        People emp4 = new People(22, 2, 1250, "Svyatoslav", "Borodin");
        People emp3 = new People(24, 3, 1800, "Artem", "Denisov");
        ArrayList<People> peopleList = new ArrayList<>();
        peopleList.add(emp1);
        peopleList.add(emp3);
        peopleList.add(emp2);
        peopleList.add(emp4);
        System.out.println("Before id and name sorting: " + peopleList);
        Collections.sort(peopleList);
        System.out.println("After id and name sorting: " + peopleList);
        int peopleIndex = Collections.binarySearch(peopleList, emp2);
        System.out.println("Index emp2: " + peopleIndex);
        int[] array = {2, -17, 3, 191, 22};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
        int index2 = Arrays.binarySearch(array, 3);
        System.out.println("element 3 index: " + index2);
    }
}
