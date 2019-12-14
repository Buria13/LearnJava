package multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        // walk.run(); Эта строка НЕ запускает новый поток, а запускает run() в текущем потоке
        walk.start();

        Thread talk = new Thread(new TalkThread());
        talk.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new CallThread());
        try {
            String result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown(); // Потоки доработают до конца
        service.shutdownNow(); // Потоки прервутся
    }
}
