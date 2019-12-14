package inheritance;

public class Circle extends TwoDShape{
    double radius;

    Circle(){
        super();
        radius = 0;
    }

    Circle(double w){
        super(w, "Круг");
        radius = w / 2;
    }



    Circle(Circle ob) {
        super(ob);
        radius = ob.radius;
    }

    double area(){
        return 3.1415 * radius * radius;
    }
}
