package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("data/out.txt", true)) {
            output.write(48);
            byte[] value = {65, 67, 100, 67};
            output.write(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
