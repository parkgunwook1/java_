package school.alone.ch_1.interfaceex.shop;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        if(seller instanceof  Customer) { // 다운 캐스팅하기 위해서는 instanceof를 사용하여 본래 인스턴스 자료형으로 안전하게 변환할 수 있다.
            Customer customer1 = (Customer)seller;
            customer1.buy();
            customer1.sell();
        }
        customer.order();
    }
}
