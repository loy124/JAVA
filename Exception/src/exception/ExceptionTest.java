package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("a.txt")){

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }


//        FileInputStream fis = null;
//
//        try {
//            fis = new FileInputStream("a.txt");
////            fis.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
////            fis.close();
//            //finally는 무조건 수행
//        }
//        finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//                System.out.println("finally");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("end");
    }
}
