package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>() {
            {
                this.offer("Jeans");
            }
        };

        queue.offer("Dress"); // добавляет в конец очереди
        queue.add("T-Shirt");
        System.out.println(queue);
        System.out.println();

        queue.forEach(System.out::println);
        System.out.println();

        queue.remove(); // Удалит первый зашедший в очередь элемент
        queue.forEach(System.out::println);
        System.out.println();

        queue.remove("Dress");
        queue.forEach(System.out::println);

        queue.clear();
        // queue.remove(); при попытке извлечь элемент из пустой очереди - исключение



    }
}
