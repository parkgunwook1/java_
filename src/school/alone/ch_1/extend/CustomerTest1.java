package school.alone.ch_1.extend;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerPark = new Customer();
        customerPark.setCustomerID(101010);
        customerPark.bonusPoint = 1000;
        System.out.println(customerPark.showCustomerInfo());

        VIPCustomer customerLee = new VIPCustomer();
        customerLee.setCustomerID(101020);
        customerLee.bonusPoint = 10000;
        System.out.println(customerLee.showCustomerInfo());
    }
}
