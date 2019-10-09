package lamda;

interface PrintString{
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString printString = s -> System.out.println(s);
        printString.showString("test");
        showMyString(printString);

        PrintString test = returnString();
        test.showString("Test3");
    }

    public static void showMyString(PrintString p){
        p.showString("test2");
    }

    public static PrintString returnString() {
        return s->System.out.println(s + "!!!");
    }


}
