package inheritance;

public class Shapes {
    public static void main(String[] args) {

        Triangle t = new Triangle("контурный", 8, 12);
        // Создать копию
        Triangle tc = new Triangle(t);


        ColorTriangle t1 = new ColorTriangle("Синий", "Закрашенный", 4, 5);



        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        t1.getColor();
        System.out.println("Площадь: " + t1.area());




    }
}
