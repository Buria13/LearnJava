package shildt;

public class StaticDemo {
    public static void main(String[] args) {
        Static object1 = new Static();
        Static object2 = new Static();

        object1.x = 2;
        object2.x = 10;

        Static.y = 1;

        System.out.println(object1.sum());
        System.out.println(object2.sum());

        Static.y = 100;

        System.out.println(object1.sum());
        System.out.println(object2.sum());

//---------------------------------------------------
        System.out.println();
//---------------------------------------------------


        System.out.println(Static.val);
        System.out.println(Static.valDiv2());

        Static.val = 4;
        System.out.println(Static.valDiv2());






    }
}
