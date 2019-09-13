package Cafe;

public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    public int menuSelect(int money){
        if(money == Menu.STARIMERICANO){
            return 4000;
        }
        else if (money == Menu.STARLATTE){
            return 4300;
        }
        else{
            return 0;
        }

    }

    public void buyStarCoffee(StarCoffee starCoffee, int money){

       String message = starCoffee.buying(4000);
       if(message != null){
           System.out.printf("%s 님은 %d %s",name, money, message);
           this.money -=money;
           System.out.println("남은 잔액은 "+this.money + "입니다");
       }

    }

    public void buyBeanCoffee(BeanCoffee beanCoffee, int money){
        String message = beanCoffee.buying(Menu.BEANLATTE);
        if(message != null){
            System.out.printf("%s 님은 %d %s ", name, money, message);
            this.money -=money;
            System.out.println("남은 잔액은 "+this.money + "입니다");
        }
    }


}
