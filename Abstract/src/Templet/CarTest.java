package Templet;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        Car menualCar = new MenualCar();
//        aiCar.run();
//        menualCar.run();

        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(aiCar);
        carArrayList.add(menualCar);

        for(Car car : carArrayList){
            car.run();
            System.out.println("======================");
        }
    }

}
