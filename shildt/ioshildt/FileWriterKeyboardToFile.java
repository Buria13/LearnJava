package shildt.ioshildt;

import java.io.*;

public class FileWriterKeyboardToFile {
    public static void main(String[] args) {
        String str;
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца строка 'stop'");

        try  (FileWriter fileWriter = new FileWriter("data/keyboard.txt")){
            do {
                System.out.print("str = ");
                str = bufferedReader.readLine();
                if(str.compareTo("stop") == 0) break;
                str += "\r\n";
                fileWriter.write(str);
            } while(str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
