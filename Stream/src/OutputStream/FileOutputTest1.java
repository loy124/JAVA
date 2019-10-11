package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
    public static void main(String[] args) {
//true로 지정하면 연속해서 들어간다.
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {

            fos.write(65);
            fos.write(66);
            fos.write(67);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
