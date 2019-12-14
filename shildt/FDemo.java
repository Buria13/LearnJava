package shildt;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // Вызывается при удалении объекта
    protected void finalize() {
        System.out.println("Финализация + " + x);
    }

    // Генерирует объект, который тотчас же уничтожается
    void generator(int i) {
        FDemo o = new FDemo(i);
    }

}
