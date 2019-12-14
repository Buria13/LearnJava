package shildt.threads;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        ThreadImproved thrd1 = new ThreadImproved("Поток #1");
        ThreadImproved thrd2 = new ThreadImproved("Поток #2");
        ThreadImproved thrd3 = new ThreadImproved("Поток #3");

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Завершение основного потока");
    }
}
