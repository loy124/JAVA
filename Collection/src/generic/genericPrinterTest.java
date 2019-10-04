package generic;

public class genericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter.toString());
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter.toString());
        plasticPrinter.printing();

//        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
//        Water water = new Water();
//        plasticPrinter.setMaterial(water);
//        System.out.println(waterPrinter.toString());

        GenericPrinter printer = new GenericPrinter();

    }
}
