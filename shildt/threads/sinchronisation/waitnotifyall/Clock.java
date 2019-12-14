package shildt.threads.sinchronisation.waitnotifyall;

public class Clock {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        ClockThread thread1 = new ClockThread("Tick", tt);
        ClockThread thread2 = new ClockThread("Tock", tt);

        try {
            thread1.thrd.join();
            thread2.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
