package Car;

public class Grandeur extends Car{
    @Override
    public void turnOn() {
        System.out.println("Grandeur 시동을 켭니다");
    }

    @Override
    public void go() {
        System.out.println("Grandeur 달립니다");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur 멈춥니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Grandeur 시동을 끕니다");
    }

    @Override
    public void washCar() {
        System.out.println("세차를 합니다");
    }
}
