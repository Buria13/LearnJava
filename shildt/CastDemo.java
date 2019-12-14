package shildt;

public class CastDemo {
    public static void main (String args[]) {

        int number = 989;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) System.out.println(number + " делитсья на " + i);
        }

    }
}
