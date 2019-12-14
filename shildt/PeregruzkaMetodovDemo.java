package shildt;

public class PeregruzkaMetodovDemo {
    public static void main(String args[]) {

        PeregruzkaMetodov ob = new PeregruzkaMetodov();

        ob.OverloadDemo();

        ob.OverloadDemo(5);

        ob.OverloadDemo(2, 5);

        ob.OverloadDemo(2d, 5d);

        ob.OverloadDemo(2, 5.0);

        ob.OverloadDemo(2, 5d);

    }
}
