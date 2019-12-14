package shildt;

public class PeregruzkaMetodov {

    void OverloadDemo(){
        System.out.println("Версия без параметров");

    }

    void OverloadDemo(int a){
        System.out.println("Один параметр:" + a);

    }

    int OverloadDemo(int a, int b){
        System.out.println("Два параметра и их сумма  " + (a + b) );
        return a + b;

    }

    double OverloadDemo(double a, double b){
        System.out.println("Два параметра и их перемножение  " + (a * b));
        return a * b;
    }



}
