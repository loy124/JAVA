package Cafe;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("kim", 50000);
        StarCoffee starCoffee = new StarCoffee();

        kim.buyStarCoffee(starCoffee, kim.menuSelect(4000));

        Person lee = new Person("lee", 10000);
        BeanCoffee beanCoffee = new BeanCoffee();

        lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
    }
}