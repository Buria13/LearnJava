package shildt.threads.sinchronisation.waitnotifyall;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "thicked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
                wait();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while(!state.equals("ticked"))
                wait();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        }
    }
}
