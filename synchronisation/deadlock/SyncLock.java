package synchronisation.deadlock;

public class SyncLock {
    public static void main(String[] args) {
        InviteAction obj1 = new InviteAction("First");
        InviteAction obj2 = new InviteAction("Second");

        new Thread(() -> obj1.invite(obj2)).start();
        new Thread(() -> obj2.invite(obj1)).start();

    }
}
