package school.ch1.together.study.ch9_object.abstraction.model;

public class Product {
    // 클래스 선언 구문 사용가능한 접근제한자 : public, default
    // public 선언 해야 다른 패키지 접근 가능.
    // default 설정한 경우 같은 패키지에서만 접근 가능.
    // public 을 없애면 다른 패키지에 있는 run 클래스에서 product 클래스를 못찾는다.

    // 클래스내에 public class 는 1개만 존재해야함.

    // 상품명, 상품가격, 브랜드  | 필드 부
    private  String pName;
    private int price;
    private String brand;

    public Product() { // 반환형이 붙어있으면 메서드, 없으면 생성자

    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }

    // 모든 필드값을 출력해주는 information 메서드
    public void information() {
        System.out.println("상품명 : " + pName+", 가격: "+ price +"원 , 브랜드 : " + brand);
    }
}

/*class InnerProduct { // inner 클래스 선언도 가능
class Product2 { // default 클래스 선언 가능*/

