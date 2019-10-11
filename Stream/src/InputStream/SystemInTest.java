package InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {

        System.out.println("입력 후 끝이라고 쓰세요.");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
//            while ((i = System.in.read()) != '끝') {
            while ((i = isr.read()) != '끝') {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
