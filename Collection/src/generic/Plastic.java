package generic;

public class Plastic extends Meterial{
    public String toString() {
        return "재료는 Plastic 입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 으로 프린팅합니다");
    }
}
