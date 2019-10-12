package thread;

//class MyThread extends Thread{
    class MyThread implements Runnable{
    public void run() {
        int i;
        for(i=0; i<=200; i++){
            System.out.println(i + "\t");

            try {
//                sleep(10);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println("start"); //메인스레드
//        MyThread th1 = new MyThread(); //스레드 1
//        MyThread th2 = new MyThread(); //스레드 2
//        th1.start();
//        th2.start();

        MyThread runner1 = new MyThread();
        MyThread runner2 = new MyThread();
        Thread t1 = new Thread(runner1);
        Thread t2 = new Thread(runner2);
        t1.start();
        t2.start();

        Thread t = Thread.currentThread(); //메인스레드
        System.out.println(t);
        System.out.println("end");

    }
}
