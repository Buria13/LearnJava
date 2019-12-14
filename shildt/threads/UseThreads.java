package shildt.threads;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Создание испольняемого объекта
        FirstThread fThread = new FirstThread("Child #1");

        // Формирование потока для объекта
        Thread newThread = new Thread(fThread);

        // Начать выполнение потока
        newThread.start();

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
