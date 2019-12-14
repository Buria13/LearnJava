package shildt.threads;

public class MoreThreadsIsAlive {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        ThreadImproved thrd1 = new ThreadImproved("Поток #1");
        ThreadImproved thrd2 = new ThreadImproved("Поток #2");
        ThreadImproved thrd3 = new ThreadImproved("Поток #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }
        } while(thrd1.thread.isAlive() ||
                thrd2.thread.isAlive() ||
                thrd3.thread.isAlive());

        System.out.println("Завершение основного потока");
    }
}
