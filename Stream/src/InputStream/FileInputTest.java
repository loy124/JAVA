package InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            int i;
            //마지막에 -1를 반환한다.
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
//            int i = fis.read();
//            System.out.println((char)i);
//            i = fis.read();
//            System.out.println((char)i);
//            i = fis.read();
//            System.out.println((char)i);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
