package io;

import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("data/info.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("data/bufferStream.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            String line;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
