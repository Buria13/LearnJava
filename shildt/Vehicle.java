package shildt;

class Vehicle implements IVehicle {
    int passengers;     // количество пассажиро
    int fuelcap;        // емкость топливного бака
    int mpg;            // расход топлива милей на галлон

    // Конструктор класса shildt.Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Рассчет максимальной дальности поездки
    public int range() {
        return fuelcap * mpg;
    }

    // Рассчет необходимого кол-ва топлива для заданного расстояния
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}
