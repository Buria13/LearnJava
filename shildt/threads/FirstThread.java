package shildt.threads;

public class FirstThread implements Runnable {
    String threadName;

    FirstThread(String name){
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + threadName + ", счетчик: " + count);
                            }
        } catch (InterruptedException e) {
            System.out.println(threadName + "прерван");
        }
        System.out.println(threadName + " - заваршение");
    }
}
