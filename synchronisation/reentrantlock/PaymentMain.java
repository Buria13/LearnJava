package synchronisation.reentrantlock;

import synchronisation.notify.Payment;

import java.util.concurrent.TimeUnit;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentLock payment = new PaymentLock();

        new Thread(() -> payment.doPayment()).start();

        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        payment.init();
        System.out.println("The End...");

    }
}
