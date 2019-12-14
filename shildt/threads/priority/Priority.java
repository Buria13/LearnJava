package shildt.threads.priority;

public class Priority implements Runnable {
    int count;
    Thread thread;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " поток запушен");

        do {
            count++;
            if(currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("В " + currentName);
            }
        } while (!stop && count < 10_000_000);
        stop = true;

        System.out.println("\n" + thread.getName() + " - завершение");
    }
}
