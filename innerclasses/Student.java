package innerclasses;

public class Student {
    private int studentId;
    private String name;
    private int group;
    private String faculty;
    private Address adress;

    class Address {
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private long phoneNumber;

        // private static String skype;     // Внутренный класс НЕ МОЖЕТ содержать static поля

        // class Wrong{}                    // Вложенность классов более одного крайне НЕ РЕКОМЕНДУЕМА

        public Address() {

        }

        public void action() {
            name = "Siarhei";               // Внутренний класс имеет ПОЛНЫЙ доступ к полям своего класса владельца
        }

    }

    public Student() {

    }

    public void operation() {
        adress.city = "Kiev";   // Доступ к полю ВНУТРННЕГО КЛАССА только через ОБЪЕКТ (несмотря на private доступ)
    }





}
