package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputMain {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("data/info.txt");
            int code = input.read();
            System.out.println(code + " | char = " + (char)code);
            byte[] ar = new byte[16];
            int num = input.read(ar);
            System.out.println("Количество прочитанных байтов: num = " + num);
            System.out.println("Массив байтов ar = " + Arrays.toString(ar));
            // input.close(); !!! WRONG
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(input != null){
                input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
