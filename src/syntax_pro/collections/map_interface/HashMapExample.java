package syntax_pro.collections.map_interface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// (Interface) Map не относится к Collections, соответственно с ним другие подходы в работе.
// Содержит не элементы, а пары "ключ - значение". Популярные методы: put, containsKey, containsValue, entrySet, keySet, values
// Методы HashMap работают ОЧЕНЬ быстро.
public class HashMapExample {
    public static void main(String[] args) {
        // Пусть номер паспорта - ключ, имя и фамилия - значение.
        Map<Integer, String> map = new HashMap<>();
        map.put(1234, "Zaur Tregulov");
        map.put(4214, "Ivan Ivanov");
        map.put(6518, "Maria Sidorova");
        map.put(2221, "Ignat Varfolomeev");
        map.put(1234, "Artem Denisov"); // Перезапись значения "Zaur Tregulov --> Artem Denisov"
        map.put(null, "Name Surname"); // Ключ может быть null
        map.put(2162, null); // Значение тоже может быть null
        System.out.println(map);
        map.putIfAbsent(1234, "Vanya Eliseev"); // "Добавь Vanya Eliseev, если нет элемента с таким ключом"
        System.out.println(map.get(1234)); // Получаем элемент с ключом 1234
        System.out.println(map.get(1235)); // Если нет элемента с ключом 1235, получаем null
        map.remove(null);
        System.out.println(map.containsValue("Name Surname"));
        System.out.println(map.containsKey(2221));
        Set<Map.Entry<Integer, String>> entrys = new HashSet<>();
        entrys = map.entrySet();
        System.out.println(entrys);
    }
}
