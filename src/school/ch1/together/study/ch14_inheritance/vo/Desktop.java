package school.ch1.together.study.ch14_inheritance.vo;

public class Desktop {
    private String brand;
    private String pCode;
    private String pName;
    private int price;
    private boolean allInOne;

    public Desktop(){}

    public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.allInOne = allInOne;
    }
    public String information() {
        return brand+" , " +pCode +", " +pName + ", " +price + " ,"+ allInOne;
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

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }
}