package Ploymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer normal = new Customer(2011, "노말이");
        Customer normal1 = new Customer(2011, "노말아");
        Customer gold = new GoldCustomer(2013, "로이");
        Customer gold1 = new GoldCustomer(2013, "로아");
        Customer vip = new VIPCustomer(2012, "이온유", 20155112);
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
        customerArrayList.add(normal);
        customerArrayList.add(normal1);
        customerArrayList.add(gold);
        customerArrayList.add(gold1);
        customerArrayList.add(vip);


        for(Customer customer : customerArrayList){
            System.out.println(customer.calcPrice(10000));
            System.out.println(customer.showCustomerInfo());
            System.out.println(customer.getCustomerID());
        }

    }
}
