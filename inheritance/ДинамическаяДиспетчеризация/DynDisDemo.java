package inheritance.ДинамическаяДиспетчеризация;

public class DynDisDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 sub1ob = new Sub1();
        Sub2 sub2ob = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = sub1ob;    // Результаты выполнения методов,
        supRef.who();       // будет зависеть от типа объекта,
        supRef = sub2ob;    // на который указывает переменная SupRef,
        supRef.who();       // а не типом самой переменной



    }
}
