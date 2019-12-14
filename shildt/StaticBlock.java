package shildt;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2);
        rootOf3 = Math.sqrt(3);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }

}
