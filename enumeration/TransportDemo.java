package enumeration;

public class TransportDemo {
    public static void main(String[] args) {
        //Transport tp;

        System.out.println("Типичная скорость самолета: " + Transport.AIRPLANE.getSpeed());

        for(Transport t: Transport.values()) {
            System.out.println(t + " скорость: " + t.getSpeed());
        }
    }
}
