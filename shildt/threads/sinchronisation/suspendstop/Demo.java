package shildt.threads.sinchronisation.suspendstop;

public class Demo {
    public static void main(String[] args) {
        MyThread ob1 = new MyThread("My Thread");

        try {
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            System.out.println("Остановка потока");
            ob1.myStop();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Выход из основного потока");
    }

}
