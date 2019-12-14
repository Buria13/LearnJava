package inheritance;

class Vehicle {
    private int passengers;     // количество пассажиро
    private int fuelcap;        // емкость топливного бака
    private int mpg;            // расход топлива милей на галлон

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Методы доступа к переменным
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }

    // Рассчет максимальной дальности поездки
    int range() {
        return fuelcap * mpg;
    }

    // Рассчет необходимого кол-ва топлива для заданного расстояния
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}
