package syntax_pro.collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

// Not sync collection. FIFO First in - first out
public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur"); // Добавление в конец очереди
        queue.add("Artem");
        queue.add("Semen");
        queue.offer("Vlad"); // Если очередь имеет ограниченный размер, при добавлении лишнего элемента исключение не выбросится, а элемент просто не добавится.
        System.out.println(queue);
        System.out.println(queue.remove()); // Удаляется из начала
        System.out.println(queue);
        System.out.println(queue.poll()); // Если удаляешь, а в очереди уже ничего нет. Exception не выбросится, вернётся null.
        System.out.println(queue);
        System.out.println(queue.element()); // Кто стоит на первом месте? (в начале очереди)
        System.out.println(queue.peek()); // Работает как element, возвращает null и не выбрасывает Exception.
    }
}
