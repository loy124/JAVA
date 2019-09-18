package Car;

public abstract class Car {
    public abstract void turnOn();
    public abstract void go();
    public abstract void stop();
    public abstract void turnOff();

    public void washCar(){}

    final public void run(){
        turnOn();
        go();
        stop();
        turnOff();
        washCar();
    }




}
