package shildt.threads;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        ThreadImproved thrd1 = new ThreadImproved("Поток #1");
        ThreadImproved thrd2 = new ThreadImproved("Поток #2");
        ThreadImproved thrd3 = new ThreadImproved("Поток #3");

        try {
            thrd1.thread.join();
            System.out.println(thrd1.thread.getName() + " присоединен");
            thrd2.thread.join();
            System.out.println(thrd2.thread.getName() + " присоединен");
            thrd3.thread.join();
            System.out.println(thrd3.thread.getName() + " присоединен");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Завершение основного потока");
    }
}
