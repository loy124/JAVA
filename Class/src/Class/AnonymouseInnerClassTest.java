package Class;

class Outer1 {

    static int sNum = 200;
    int outNum = 100;

    public Runnable getRunnable(int i) { //상수화가 되어 참조는 가능하나 변경은 불가능하다

        int num = 100;
        //익명 이너 클래스
        return new Runnable() {

            @Override
            public void run() {
                //지역 내부 클래스
//                num += 10;
//                i = i + 10;
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };

    }
    //익명 이너 클래스는 단하나의 추상인터페이스의 경우 바로 생성가능
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };
}

public class AnonymouseInnerClassTest {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.runner.run();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();// run은 언제든지 호출가능
    }
}
