package shildt.threads.sinchronisation.suspendstop;

public class MyThread implements Runnable{
    Thread thrd;

    volatile boolean suspended;
    volatile boolean stopped;

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");

        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if(i % 10 == 0){
                    System.out.println();
                    Thread.sleep(250);
                }

                // Тестирование переменных suspended и stopped
                synchronized (this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thrd.getName() + " - выход");
    }

    synchronized void myStop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mySuspend() {
        suspended = true;
    }

    synchronized void myResume() {
        suspended = false;
        notify();
    }

}
