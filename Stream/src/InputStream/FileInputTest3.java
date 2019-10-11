package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input2.txt")) {
            int i;
            byte[] bs = new byte[10];
            //마지막에 -1를 반환한다.

            while((i = fis.read(bs)) != -1) {
//                for(byte b: bs) {
//                    System.out.print((char)b);
//                }
//가비지가 출력되기때문에 버퍼를 사용
                System.out.println(i);
                for(int k =0; k < i; k++){
                    System.out.print((char)bs[k]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
