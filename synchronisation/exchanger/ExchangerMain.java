package synchronisation.exchanger;

import java.util.concurrent.TimeUnit;

public class ExchangerMain {
    public static void main(String[] args) {
        ItemAction action = new ItemAction();
        Item item1 = new Item(101, 5.0, "Tie");
        Item item2 = new Item(666, 13.13, "Shoes");
        System.out.println(item1 + "\n" + item2);

        new Thread(() -> action.doActionPrice(item1, 0.5f)).start();
        new Thread(() -> action.doActionDescription(item2, " со скидкой")).start();

        try {
            TimeUnit.SECONDS.timedJoin(Thread.currentThread(), 2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(item1 + "\n" + item2);

    }
}
