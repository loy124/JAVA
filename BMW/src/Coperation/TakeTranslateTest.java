package Coperation;

public class TakeTranslateTest {
    public static void main(String[] args) {
        Student studentL = new Student("온유", 6000);
        Student studentM = new Student("민지", 10000);
        Student edward = new Student("에드워드", 50000);

        Bus bus100 = new Bus(100);
        Bus bus400 = new Bus(400);
        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(1);
        Taxi taxiYellow = new Taxi(1111);

        studentL.takeBus(bus100);
        studentL.takeSubway(subwayBlue);
        studentM.takeSubway(subwayGreen);
        edward.takeTaxi(taxiYellow);

        studentL.showInfo();
        studentM.showInfo();
        edward.showInfo();

        bus100.showBusInfo();
        bus400.showBusInfo();
        subwayGreen.showSubwayInfo();
        subwayBlue.showSubwayInfo();

        taxiYellow.showTaxiInfo();

    }
}
