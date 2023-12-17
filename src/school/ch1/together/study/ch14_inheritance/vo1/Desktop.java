package school.ch1.together.study.ch14_inheritance.vo1;

public class Desktop extends Product{

    private boolean allInOne;

    public Desktop() {
        // super(); -> 부모 클래스의 주소값을 보관하고있음.
        // super.으로 부모에 접근 가능.
    }
    // 매개변수 allInOne 필드를 추가한 5개 가진 Desktop 메서드
    public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {

        // brand, pcode, pname, price를 부모 클래스의 product에 있는 필드에 초기화
        // super(brand, pCode, pName, price);

        // set 메서드 사용
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
