package Car;

public class Avante extends Car{
    @Override
    public void turnOn() {
        System.out.println("Avante 시동을 켭니다");
    }

    @Override
    public void go() {
        System.out.println("Avante 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("Avante 멈춥니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Avante 시동을 끕니다");
    }

}
