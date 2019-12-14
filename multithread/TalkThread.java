package multithread;

import java.util.concurrent.TimeUnit;

public class TalkThread implements Runnable {



    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talk " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
