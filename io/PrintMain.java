package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintMain {
    public static void main(String[] args) {
        File file = new File("data\\res.txt");
        double[] values = {0.1, 42.42, 666.06};
        try(PrintStream stream = new PrintStream(new
                FileOutputStream("data/res.txt")))
        {
            for(double value : values) {
                stream.printf("value: %.4g %n", value);
                System.setOut(stream);
                System.out.print(value + " ");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
