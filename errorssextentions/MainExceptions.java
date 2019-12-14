package errorssextentions;

public class MainExceptions {
    public static void main(String[] args) {
        try {
        int value = 1 / 0;
        } catch (ArithmeticException e){
            System.err.println(e);
        }
        System.out.println("Работа не останавливается");

        Object object = null;
        object.getClass(); // NullPointerException



    }
}
