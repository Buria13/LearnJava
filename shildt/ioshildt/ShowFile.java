package shildt.ioshildt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Использование ShowFile");
            System.out.println(Arrays.toString(args));
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
