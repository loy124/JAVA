package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            //마지막에 -1를 반환한다.
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
