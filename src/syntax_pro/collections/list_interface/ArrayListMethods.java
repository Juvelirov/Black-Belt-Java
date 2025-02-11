/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package syntax_pro.collections.list_interface;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Olya");
        list.add("Prokofiy");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        list2.add("!!!");
        list.addAll(1, list2); // добавить все элементы list2 в list, начиная с индекса 1
        System.out.println(list);
        list.clear(); // очистит лист
        System.out.println(list);
        System.out.println(list2.indexOf("???")); // вернёт индекс элемента и -1 если он не найден
        System.out.println(list2.lastIndexOf("!!!")); // вернёт индекс первого найденного объекта с конца
        System.out.println(list.size()); // количество элементов (размер), не путать с capacity
        System.out.println(list.isEmpty()); // есть ли элементы в массиве?
        System.out.println(list2.contains("!!!@")); // есть ли строка в листе?


    }
}
