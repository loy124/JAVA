package AbstractEx;

public abstract class Computer {

    //구현해야하는 메소드를 상위에 지정해놓고 구현의 책임을 하위에 위임한다
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
