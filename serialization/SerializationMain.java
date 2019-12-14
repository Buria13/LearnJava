package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new
            FileOutputStream("data/out.txt"));
            Student student = new Student("Bob", 555777, "qwerty");
            outputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
