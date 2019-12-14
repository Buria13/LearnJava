package enumeration.interfaces;

public class Demo {
    public static void main(String[] args) {
        RectangleParam rectangleParam = RectangleParam.PERIMETER;

        System.out.println(rectangleParam.service(3, 5));
    }
}
