package Coperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money) { //승차 메서드
        this.money += money;
        passengerCount ++;
    }

    public void showBusInfo(){
        System.out.println(busNumber + "번의 버스의 승객은 " + passengerCount + "명 이고 수익은" + money + " 입니다");
    }
}
