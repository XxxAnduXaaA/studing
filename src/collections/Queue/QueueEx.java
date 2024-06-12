package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

//        Если переполнена очередь - вызывает исключение
        queue.add("Nikita");
        queue.add("Marina");
        queue.add("Margarita");

//        Если переполнена очередь - не вызывает исключения
        queue.offer("Zaur");
        queue.offer("Nikolay");

        System.out.println(queue);

//        Вызывает исключение, если очередь пуста
        System.out.println(queue.remove());

//        Можно удалять конкретный объект, но в очереди нет смысла, если операция будет частой
        System.out.println(queue.remove("Nikolay"));

//        Не вызывает исключение, если очередь не пуста
        System.out.println(queue.poll());

        System.out.println(queue);

//        Получение элемента с вызовом исключения
        System.out.println(queue.element());

//        Получение элемента без вызова исключения
        System.out.println(queue.peek());
    }
}
