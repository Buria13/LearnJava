package synchronisation;

public class UseFileThread extends Thread {
    protected CommonResource resource;

    public UseFileThread(String name, CommonResource resource) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.writing(this.getName(), i); // Вызов синхронизированного метода
        }
    }

}
