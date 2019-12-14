package inheritance;

public class TruckDemo {

    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println(pickup.getCargo());
    }

}
