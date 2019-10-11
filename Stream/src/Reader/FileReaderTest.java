package Reader;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("reader.txt");
//        FileInputStream fis = new FileInputStream("reader.txt");
        //이미 바이트로읽엇을때(소켓)
        //보조스트림 사용
//        InputStreamReader isr = new InputStreamReader(fis);


        int i;
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }
        fis.close();
    }
}
