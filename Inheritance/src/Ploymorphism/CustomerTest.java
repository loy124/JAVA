package Ploymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer normal = new Customer(2011, "노말이");
        Customer vip = new VIPCustomer(2012, "이온유");
        Customer gold = new GoldCustomer(2013, "로이");
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
        customerArrayList.add(normal);
        customerArrayList.add(vip);
        customerArrayList.add(gold);

        for(Customer customer : customerArrayList){
            System.out.println(customer.calcPrice(50000));
            System.out.println(customer.showCustomerInfo());
            System.out.println(customer.getCustomerID());
        }

    }
}
