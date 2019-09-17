package Inheritance;

public class OverrideTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1011,"이순신");
        customer.bonusPoint = 10000;

        //자바에서는 항상 인스턴스(VIPCustomer)의 메서드가 호출됨

        Customer vipCustomer = new VIPCustomer(10011,"세종대왕");
        vipCustomer.bonusPoint = 10000;

       int priceNormal = customer.calcPrice(10000);
       int priceVip =  vipCustomer.calcPrice(10000);

        System.out.println(customer.showCustomerInfo() + "지불 금액은 " + priceNormal);
        System.out.println(vipCustomer.showCustomerInfo() + "지불 금액은 " + priceVip);

    }
}
