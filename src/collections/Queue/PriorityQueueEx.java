package collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
//        Работает по натуральному порядку, в остальном также как queue
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        pQ.add(20);
        pQ.add(7);
        pQ.add(4);
        pQ.add(5);
        pQ.add(1);
        pQ.add(44);

        System.out.println(pQ);

        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.remove());
        System.out.println(pQ.poll());
        System.out.println(pQ.poll());

    }
}
