package shildt.threads.sinchronisation;

public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        MyThread mt1 = new MyThread("Поток №1", a);
        MyThread mt2 = new MyThread("Поток №2", a);
    }
}
