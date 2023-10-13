package school.ch1.together.study.ch14_inheritance.vo1;

public class Desktop extends Product{

    private boolean allInOne;

    public Desktop() {
        // super(); -> 부모 클래스의 주소값을 보관하고있음.
        // super.으로 부모에 접근 가능.
    }
    public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {

        // brand, pcode, pname, price를 부모 클래스의 product에 있는 필드에 초기화
        // super(brand, pCode, pName, price);

        super.setBrand(brand);
        super.setpCode(pCode);
        super.setpName(pName);
        super.setPrice(price);
        this.allInOne =allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    //오버라이딩 : 부모클래스 메서드 재정의하는 것.
    public String information() {
        return super.information()+ "allInOne : " + allInOne;
    }
}
