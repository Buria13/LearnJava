package shildt.threads.sinchronisation.waitnotifyall;

public class ClockThread implements Runnable {
    Thread thrd;
    TickTock ttObject;

    ClockThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttObject = tt;
        thrd.start();
    }

    @Override
    public void run() {


            if(thrd.getName().compareTo("Tick") == 0) {
                for (int i = 0; i < 8; i++) {
                    ttObject.tick(true);
                }
                ttObject.tick(false);
            } else {
                for (int i = 0; i < 5; i++) {
                    ttObject.tock(true);
                }
                ttObject.tick(false);
            }

    }
}
