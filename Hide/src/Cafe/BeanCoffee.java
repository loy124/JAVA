package Cafe;

public class BeanCoffee {
    int money;

    public String buying(int money){
        this.money += money;
        if(money == Menu.BEANIMERICANO){
            return "콩카페 아메리카노를 구매했습니다. ";
        }
        else if(money == Menu.BEANLATTE){
            return  "콩카페 라떼를 구매했습니다. ";
        }
        else {
            return  null;
        }
    }

}
