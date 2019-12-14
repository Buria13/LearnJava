package shildt.ioshildt;

import java.io.*;

public class ReadWrtiteData {
    public static void main(String[] args) {
        int i = 10;
        double d = 42.42;
        boolean b = false;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data/testdata.txt"))) {
            dataOut.writeInt(i);
            dataOut.writeDouble(d);
            dataOut.writeBoolean(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("data/testdata.txt"))) {
            int iIn = dataIn.readInt();
            System.out.println(iIn);
            double dIn = dataIn.readDouble();
            System.out.println(dIn);
            boolean bIn = dataIn.readBoolean();
            System.out.println(bIn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
