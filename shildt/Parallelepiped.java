package shildt;

public class Parallelepiped {
    int a, b, c;
    int volume;


    Parallelepiped(int length, int width, int height) {
        a = length;
        b = width;
        c = height;
        volume = a * b * c;
    }

    boolean samePar(Parallelepiped ob) {
        return ((ob.a == a) & (ob.b == b) & (ob.c == c));
    }

    boolean sameVol(Parallelepiped ob){
        return ob.volume == volume;
    }

}
