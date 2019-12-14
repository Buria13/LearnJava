package inheritance;

public class Triangle extends TwoDShape {
    String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }

    Triangle(Triangle ob) {
        super(ob);      // в конструктор супркласса передается объект Triangle,
                        // однако недоразумений не возникает (из за наличия лишних параметров)
                        // Конструктору суперкласса _М_О_Ж_Н_О_ передавать ссылку на экземпляр подкласса
                        // Инициализированы будут только те части, которые являются членами класса TwoDShape
        style = ob.style;
    }

    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");

        style = s;
    }

    // Переопределение метода area() для класса Triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник: " + style);
    }


}
