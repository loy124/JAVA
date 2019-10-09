package Class;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i) { //상수화가 되어 참조는 가능하나 변경은 불가능하다

        int num = 100;
        class MyRunnable implements Runnable {

            @Override
            public void run() {
                //지역 내부 클래스
//                num += 10;
//                i = i + 10;
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();// run은 언제든지 호출가능
    }
}
