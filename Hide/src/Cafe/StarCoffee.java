package Cafe;

public class StarCoffee {
    int money;

    public String buying(int money){
        this.money +=money;
        if(money == Menu.STARIMERICANO){
            return "스타 아메리카노를 구매하셨습니다.";
        }
        else if (money == Menu.STARLATTE){
            return  "스타 라떼를 구매하셨습니다.";
        }
        else {
            return null;
        }
    }
}
