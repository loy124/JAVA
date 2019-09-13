package Coperation;

public class Taxi {
    int taxiNumber;
    int passengerCount;
    int money;

    public Taxi(int taxiNumber){
        this.taxiNumber = taxiNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount ++;
    }

    public void showTaxiInfo(){
        System.out.println(taxiNumber + "번 택시의 승객은 " + passengerCount + "명 이고 수익은" + money + " 입니다");
    }
}
