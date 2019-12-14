package synchronisation;

import java.util.concurrent.TimeUnit;

public class SynchBlockMain {
    static int counter;

    public static void main(String[] args) {
        StringBuilder info = new StringBuilder();
        new Thread(() -> {
            do {
                synchronized (info) {
                    info.append('A');
                }
                System.out.println(info);
                try {
                    TimeUnit.NANOSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            } while (counter < 5);
        }).start();
        new Thread(() -> {
            do {
                synchronized (info) {
                    info.append('z');
                }
                System.out.println(info);
                counter++;
            } while (counter < 5);
        }).start();
    }
}
