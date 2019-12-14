package shildt;

public class varArgs {
    static void vaTest(int ... v) {
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое:");

        for(int i : v){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }



    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 5, 7);
        vaTest();
    }
}
