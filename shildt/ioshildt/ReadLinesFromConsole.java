package shildt.ioshildt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLinesFromConsole {
    public static void main(String[] args)
        throws IOException {
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите строки, признак козца строка stop");
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
