package errorssextentions;

public class Unchecked {
    public static void main(String[] args) {
        String[] numbers = {"0", "42", "Y-", "58"};
        int result;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                result = Integer.parseInt(numbers[i]);
                sum += result;
            } catch (NumberFormatException e) {
                System.err.println(e);
            } catch (ArithmeticException e) {
                System.err.println(e);
            }
        }
        System.out.println(sum);

    }
}
