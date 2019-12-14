package shildt.ioshildt;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args)
            throws IOException {
        byte[] data = new byte[10];
        System.out.println("Enter message");
        System.in.read(data);
        System.out.println("Вы ввели: ");
        for(byte i : data) System.out.print((char)i);
    }
}
