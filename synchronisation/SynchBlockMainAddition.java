package synchronisation;

import java.util.concurrent.TimeUnit;

public class SynchBlockMainAddition {
    static int counter;

    public static void main(String[] args) {
        StringBuffer info = new StringBuffer();
        new Thread(() -> {

            synchronized (info) {
                do {
                    info.append('A');
                    System.out.println(info);
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter++;
                } while (counter < 5);
            }
        }).start();

                 while(counter < 11) {
                    info.append('z');

                System.out.println(info);
                counter++;
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }
    }
}
