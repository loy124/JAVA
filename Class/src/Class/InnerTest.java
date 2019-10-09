package Class;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    //내부에서만 사용할거면 private
    public OutClass() {
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInner() {
        inClass.inTest();
    }
    //Outer 클래스의 생성과 무관
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(iNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest() {
//            System.out.println(iNum); static 안에 static 메서드안에 static 변수가 아니기때문에 불러오지 못함
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();

        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();

        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        OutClass.InStaticClass.sTest();
    }
}
