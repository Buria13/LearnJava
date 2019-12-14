package shildt.ioshildt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharsFromConsole {
    public static void main(String[] args)
        throws IOException
    {
        char c;
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы. Окончание ввода - символ 0");

        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != '0');
    }
}
