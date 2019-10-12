package thread;

import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary() {
        //한정적인 리소스
        books.add("태백산맥1");
        books.add("태백산맥2");
        books.add("태백산맥3");

    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();
//        if (books.size() == 0) return null;
//        if (books.size() == 0) {
//            System.out.println(t.getName() + " waiting start");
//            wait();
//            System.out.println(t.getName() + " waiting end");
//        }
        //못빌린 얘들은 다시 waiting으로 하기 위해 while
        while (books.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }

        String title = books.remove(0);
        System.out.println(t.getName() + ": " + title + " lend");
        return title;
    }

    public synchronized void returnBook(String title) {
        Thread t = Thread.currentThread();
        books.add(title);
        notifyAll(); //책이왔다고 알려준다
        System.out.println(t.getName() + ": " + title + " return");
    }
}

class Student extends Thread {
    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if(title == null) return;
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
        student6.start();

    }
}
