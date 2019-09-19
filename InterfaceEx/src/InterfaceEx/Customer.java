package InterfaceEx;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("물건을 사요");
    }

    @Override
    public void order() {
        System.out.println("주문");
    }

    @Override
    public void sell() {
        System.out.println("물건을 팔아요");
    }

    public void sayHello(){
        System.out.println("hello");
    }
}
