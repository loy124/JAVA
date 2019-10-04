package generic;

public class Powder extends Meterial{
    public String toString() {
        return "제품은 Powder 입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder 로 프린팅합니다");
    }
}
