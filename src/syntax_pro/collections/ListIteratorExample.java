package syntax_pro.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Расширяет обычный итератор
public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char i : s.toCharArray()){
            list.add(i);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator(); // начинает с 0
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // начинает с конца
        boolean isPolyndrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPolyndrome = false;
                break;
            }
        }
        if(isPolyndrome){
            System.out.println("polyndrome");
        }
        else{
            System.out.println("not polyndrome");
        }
    }
}
