package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new
                    FileInputStream("data/out.txt"));
            Student student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
