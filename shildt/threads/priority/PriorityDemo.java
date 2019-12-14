package shildt.threads.priority;

public class PriorityDemo {
    public static void main(String[] args) {
        Priority thread1 = new Priority("High priority");
        Priority thread2 = new Priority("Low priority");

        // Задать приоритеты
        thread1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        thread2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        thread1.thread.start();
        thread2.thread.start();

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nСчетчик потока High Priority: " + thread1.count);
        System.out.println("\nСчетчик потока Low Priority: " + thread2.count);

    }
}
