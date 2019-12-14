package shildt;

public class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Что бы преодолеть " + dist + " миль минивену нужно " +
                gallons + " галлонов топлива");gallons = minivan.fuelNeeded(dist);

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("Что бы преодолеть " + dist + " миль спорткару нужно " +
                gallons + " галлонов топлива");









    }
}
