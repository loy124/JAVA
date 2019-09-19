package InterfaceEx;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buy = customer;
        buy.buy();
        buy.order();

        Sell sell = customer;
        sell.sell();
        sell.order();

//        if(sell instanceof Customer){
//
//        }
    }
}
