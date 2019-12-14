package innerclasses;

public class SubAdress extends Student.Address {
    SubAdress() {
        new Student().super();  // Наследование внутреннего класса другого класса возможно только при создании
                                // объекта и вызова super()
    }

    SubAdress(Student student) {
        student.super();
    }
}
