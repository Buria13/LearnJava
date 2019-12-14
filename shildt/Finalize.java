package shildt;

public class Finalize {
    public static void main(String args[]) {
        int count;

        FDemo ob = new FDemo(0);

        // Генерируем большое количество объектов, в какой-то
        // момент должна начаться сборка мусора
        for(count = 1; count < 10000000; count++) {
            ob.generator(count);
        }


    }
}
