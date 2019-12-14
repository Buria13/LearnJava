package shildt.threads;

public class UseThreadImproved {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока\n");

        // Поток запускаеться при его создании!
        ThreadImproved ti = new ThreadImproved("Child #2");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println("Заваршение основного потока");

    }
}
