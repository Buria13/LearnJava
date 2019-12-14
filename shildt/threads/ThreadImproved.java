package shildt.threads;

public class ThreadImproved implements Runnable{
    Thread thread;

    ThreadImproved(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thread.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + "прерван");
        }
        System.out.println(thread.getName() + " - завершение");
    }
}
