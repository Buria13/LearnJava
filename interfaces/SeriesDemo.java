package interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }

        System.out.println("\n Сброс");
        ob.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }

        System.out.println("\n Начальное значение 100: ");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }

    }
}
