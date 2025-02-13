package syntax_pro.collections.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque - double ended queue. Можно работать, как с FIFO, так и с LIFO.
// Deque реализуют LinkedList и ArrayDeque.
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(7);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(8);
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        System.out.println(arrayDeque);
        arrayDeque.removeLast();
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
    }
}
