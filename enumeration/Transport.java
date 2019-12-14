package enumeration;

public enum Transport {
    CAR(100), TRUCK(80), AIRPLANE(600), TRAIN(70), BOAT(25);

    private int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }

}
