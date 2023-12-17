package school.ch1.together.study.ch9_object.run;

import school.ch1.together.study.ch9_object.abstraction.model.Product;

public class Run1 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setpName("iPhone-15/pro.max");
        p.setBrand("Apple");
        p.setPrice(1300000);

        Product p1 = new Product();
        p1.setpName("z플립5");
        p1.setBrand("Samsung");
        p1.setPrice(100000);

        p.information();
        p1.information();
    }
}
