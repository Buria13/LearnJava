package shildt;

public class GalToLit {
    public static void main(String args[]) {
        float gallons;
        float litres;
        gallons = Float.parseFloat(args[0]);
        litres = gallons * 3.7854f;

        System.out.println(gallons + " галлонов соответствует " + litres + " литрам");

    }
}
