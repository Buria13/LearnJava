package synchronisation.deadlock;

import java.util.concurrent.TimeUnit;

public class InviteAction {
    private String name;

    public InviteAction(String name) {
        this.name = name;
    }

    public  synchronized void invite(InviteAction obj) {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " invites " + obj.name.toUpperCase());
        obj.action();

    }

    public synchronized void action() {
        System.out.println(name + " action!");
    }
}
