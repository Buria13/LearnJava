package shildt.threads;

public class MyThreadExtendsThread extends Thread {


    MyThreadExtendsThread (String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + "прерван");
        }
        System.out.println(getName() + " - завершение");
    }
}
