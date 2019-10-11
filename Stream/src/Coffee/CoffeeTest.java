package Coffee;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee americano = new KennyaAmericano();
        americano.brewing();
        System.out.println();
        Coffee kenyaLatte = new Latte(new KennyaAmericano());
        kenyaLatte.brewing();
        System.out.println();
        Coffee kenyaMocha = new Mocha(new Latte(new KennyaAmericano()));
        kenyaMocha.brewing();
        System.out.println();
        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

    }
}
