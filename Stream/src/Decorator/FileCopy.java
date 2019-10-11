package Decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        long milliseconds = 0;
        try (FileInputStream fis = new FileInputStream("az.zip");
             FileOutputStream fos = new FileOutputStream("copy.zip")) {

            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            milliseconds = System.currentTimeMillis();

            int i;
//            while((i=fis.read()) != -1){
//                fos.write(i);
//            }
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }
        Socket socket = new Socket();
//        socket.getInputStream().read() //영문만 읽는다
//        InputStreamReader isr = new InputStreamReader(socket.getInputStream()); //문자단위로 읽는다
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream())); //문자단위 + 버퍼링
        isr.readLine(); //줄만읽는다

        System.out.println("시간 :" + milliseconds);
    }
}
