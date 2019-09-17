package Inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1011,"이순신");
        customer.setCustomerName("이순신");
        customer.setCustomerID(10010);
        customer.calcPrice(50000);
        System.out.println(customer.calcPrice(50000));
        System.out.println(customer.showCustomerInfo());
        //자바에서는 항상 인스턴스(VIPCustomer)의 메서드가 호출됨
        Customer vipCustomer = new VIPCustomer(10011,"세종대왕");
//        vipCustomer.setCustomerName("세종대왕");
//        vipCustomer.setCustomerID(10011);
        vipCustomer.calcPrice(50000);
        System.out.println(vipCustomer.calcPrice(50000));
        System.out.println(vipCustomer.showCustomerInfo());
//        customer = vipCustomer;

    }
}
