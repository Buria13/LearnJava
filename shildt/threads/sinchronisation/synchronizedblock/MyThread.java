package shildt.threads.sinchronisation.synchronizedblock;

public class MyThread implements Runnable {
    Thread thrd;
    static SumArrayNotSynchronized sa = new SumArrayNotSynchronized();
    int[] arr;
    int answer;

    // Создать новый поток
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        arr = nums;
        thrd.start();
    }

    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск");

        // вызов метода для объекта sa синхронизирован!
        synchronized (sa) {
            answer = sa.sumArray(arr);
        }
        System.out.println("Сумма для " + thrd.getName() +
                ": " + answer);

        System.out.println(thrd.getName() + " - завершение");
    }
}
