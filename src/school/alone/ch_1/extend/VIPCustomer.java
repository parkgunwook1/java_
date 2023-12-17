package school.alone.ch_1.extend;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super(); // 컴파일러가 자동으로 추가하는 코드, 상위 클래스가 호출됨
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    public int getAgentID() {
        return agentID;
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
