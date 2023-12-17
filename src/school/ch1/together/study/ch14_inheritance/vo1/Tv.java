package school.ch1.together.study.ch14_inheritance.vo1;

public class Tv extends Product{

    private int inch;

    public Tv() {} //super() 자동으로 만들어줌

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public Tv(String brand, String pCode, String pName, int price, int inch) {
        super(brand, pCode, pName, price);
        this.inch = inch;
    }
    public String information() {
        return super.information() + "inch : " + inch;
    }
}
