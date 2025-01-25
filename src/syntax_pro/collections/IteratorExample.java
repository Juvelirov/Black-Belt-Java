package syntax_pro.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Artem Igorevich");
        list.add("Russia");
        list.add("Red flag");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
