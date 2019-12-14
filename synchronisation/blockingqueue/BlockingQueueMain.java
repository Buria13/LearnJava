package synchronisation.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(5);

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    boolean flag = queue.add("Java " + i);
                    System.out.println("Element index " + i + " added " + flag);
                    TimeUnit.MILLISECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Element " + queue.remove() + " took");
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            TimeUnit.MILLISECONDS.timedJoin(Thread.currentThread(), 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(queue);
    }

}
