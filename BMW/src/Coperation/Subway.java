package Coperation;

public class Subway {

        int lineNumber;
        int passengerCount;
        int money;

        public Subway(int lineNumber){
            this.lineNumber = lineNumber;
        }

        public void take(int money) { //승차 메서드
            this.money += money;
            passengerCount ++;
        }

        public void showSubwayInfo(){
            System.out.println(lineNumber + "호선 의 승객은 " + passengerCount + "명 이고 수익은" + money + " 입니다");
        }


}
