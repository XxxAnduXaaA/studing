package collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
//        Работает как двухсторонняя очередь
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Nikita");
        deque.addLast("Marina");
        deque.addFirst("Margarita");
        deque.offerLast("Zaur");
        deque.offerFirst("Nikolay");

        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);
    }
}
