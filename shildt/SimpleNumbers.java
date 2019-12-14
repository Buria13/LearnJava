package shildt;

public class SimpleNumbers {
    public static void main (String args[]) {
        int number = 999;

        for (int i = 2; i <= number; i++) {
            int j = 2;

            while (i % j != 0 && j < i) {
                j++;
            }

            if (i == j) System.out.println(i + "   является простым числом");
        }
    }

}
