package school.ch1.together.study.ch14_inheritance.vo1;

public class Product {
    private String brand;
    private String pCode;
    private String pName;
    private int price;

    public Product() {}

    // String 반환값으로 return 을 해준다.
    // 반환을 안해주고 싶으면 void 사용
    public String information() {
        return brand+" , " +pCode +", " +pName + ", " +price;
    }

    // 4개 매개변수를 가진 생성자
    public Product(String brand, String pCode, String pName, int price) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
