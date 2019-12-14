package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReaderWrtiterMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/info.txt");
             FileWriter writer = new FileWriter("data/outReWriter.txt")){

            char[] buffer = new char[8];
            int charNum = reader.read(buffer);

            while(charNum != -1) {
                writer.write(buffer, 0, charNum);
                charNum = reader.read(buffer);
            }

            System.out.println("Массив прочитанных символов: buffer = " + Arrays.toString(buffer));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
