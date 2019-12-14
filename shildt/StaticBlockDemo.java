package shildt;

public class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");

        System.out.println("sqrt 2 = " + StaticBlock.rootOf2);
        System.out.println("sqrt 3 = " + StaticBlock.rootOf3);
    }
}
