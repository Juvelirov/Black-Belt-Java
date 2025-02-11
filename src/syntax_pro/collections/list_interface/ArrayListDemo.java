/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package syntax_pro.collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // by default тип object
        list.add("Artem"); // add - добавление элемента для всех List impl классов
        list.add("Olya");
        list.add("Prokofiy");
        System.out.println(list);
        System.out.println(list.size()); // size - размер, capacity - вместимость (при переполнении создаётся новый лист и копируются данные со старого)
        ArrayList<String> listHasStartSize = new ArrayList<>(30); // initial capacity 30, увеличили скорость добавления
        List<String> myList = new ArrayList<>(); // обрезаем возможности до List. Делаем так, если в будущем поменять ArrayList на другую колл impl List.
        ArrayList<String> namesList = new ArrayList<>(list); // создаём namesList на основе list (элементы копируются). Это НОВЫЙ объект.

    }
}
