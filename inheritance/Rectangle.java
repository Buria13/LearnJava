package inheritance;

public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }

    Rectangle(double x) {
        super(x, "квадрат");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean ifSquare() {
        return getWidth() == getHeight();
    }

    // Переопределение метода для класса Rectangle
    double area() {
        return getWidth() * getHeight();
    }

}
