package shildt.threads.sinchronisation.synchronizedblock;

public class SumArrayNotSynchronized {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " +
            Thread.currentThread().getName() + ": " + sum);
        }
        try {
            Thread.sleep(10);   // разрешить подключение задач
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }

        return sum;
    }
}
