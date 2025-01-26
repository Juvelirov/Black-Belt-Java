package syntax_pro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder[] sbArray = {sb1, sb2, sb3};
        List<StringBuilder> list = Arrays.asList(sbArray); // вернёт List из массива
        System.out.println("До изменений: (Arrays.asList) " + list);
        sb1.append("1");
        System.out.println("После изменений (Arrays.asList): " + list);
        System.out.println("------------------");
        ArrayList<String> strList = new ArrayList<>();
        strList.add("first str");
        strList.add("second str");
        strList.add("third str");
        ArrayList<String> strList2 = new ArrayList<>();
        strList2.add("hello");
        strList2.add("second str");
        strList2.add("bye-bye");
        System.out.println("strList before: (remove all) " + strList);
        strList.removeAll(strList2); // удаляет из strList элементы, которые есть в strList2 (по сути удаление дубликатов)
        System.out.println("strList after: (remove all) " + strList);
        System.out.println("------------------");
        ArrayList<String> strList3 = new ArrayList<>();
        strList3.add("first str");
        strList3.add("second str");
        strList3.add("third str");
        ArrayList<String> strList4 = new ArrayList<>();
        strList4.add("hello");
        strList4.add("second str");
        strList4.add("bye-bye");
        System.out.println("strList3 before: (retain all) " + strList3);
        strList3.retainAll(strList4); // удаляет в strList элементы, которых нет в strList2 (совпадения остаются)
        System.out.println("strList3 after: (retain all) " + strList3);
        System.out.println("----------------");
        List<Integer> intList = List.of(1, 2, 3); // создание immutable листа, вроде как для потокобезопасности?
        System.out.println(intList);
        List<Integer> intList2 = List.copyOf(intList); // immutable list не может хранить null и в него нельзя ничего добавлять
        System.out.println(intList2);
    }
}
