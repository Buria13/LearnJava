package shildt.ioshildt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String str;
        try(BufferedReader bufferedReader =
                    new BufferedReader(new java.io.FileReader("data/readfile.txt"))){
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
