package inheritance;

abstract public class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Параметризированный конструктор
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Конструирование объекта с одинаковыми значениями
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Сожать один объект, на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к переменным
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }

    abstract double area();

}
