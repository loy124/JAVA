package Templet;

public class MenualCar extends Car{
    @Override
    public void drive() {
        System.out.println("수동 주행");
        System.out.println("운전자가 수동으로 방향을 바꿉니다");
    }

    @Override
    public void stop() {
        System.out.println("운전자가 수동으로 멈춥니다");
    }

}
