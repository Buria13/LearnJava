package inheritance;

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("контурный", 4, 5);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7);
        // shapes[4] = new TwoDShape(10, 20, "фигура");  Невозможно объявить объект типа TwoDShape из-за его асбтрактности

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\nОбъект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
        }
    }

}
