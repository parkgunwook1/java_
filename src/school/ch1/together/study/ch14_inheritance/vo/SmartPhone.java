package school.ch1.together.study.ch14_inheritance.vo;

public class SmartPhone {
    private String brand;
    private String pCode;
    private String pName;
    private int price;
    private String mobileAgent;

    public SmartPhone(){}

    public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgent) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.mobileAgent = mobileAgent;
    }
    public String information() {
        return brand+" , " +pCode +", " +pName + ", " +price + " ,"+ mobileAgent;
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

    public String getMobileAgent() {
        return mobileAgent;
    }

    public void setMobileAgent(String mobileAgent) {
        this.mobileAgent = mobileAgent;
    }
}
