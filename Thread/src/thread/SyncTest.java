package thread;

class Bank{
    private int money = 10000;

//    public synchronized void saveMoney(int save) {
        public void saveMoney(int save) {
//            synchronized (this){ //객체에 락을 건다
                int m = this.getMoney();

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setMoney(m + save);
            }

//    }

//    public synchronized void minusMoney(int minus) {
        public void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{
    public void run() { //싱크로가 되지 않는다
        //블락방식으로 락을 건다
        synchronized (SyncTest.mybank){
            System.out.println("start save");
            SyncTest.mybank.saveMoney(3000);
            System.out.println("end save "+ SyncTest.mybank.getMoney());
        }

    }
}

class ParkWife extends Thread{
    public void run() {
        synchronized (SyncTest.mybank){
            System.out.println("start minus");
            SyncTest.mybank.minusMoney(1000);
            System.out.println("minus money " + SyncTest.mybank.getMoney());
        }
    }

}

public class SyncTest {
    public static Bank mybank = new Bank();
    public static void main(String[] args) throws InterruptedException {
        Park p = new Park();
        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();
        pw.start();
    }
}

