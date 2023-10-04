package school.alone.ch_1.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // 파우더 형으로 GenericPrinter 클래스 생성

        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); // 플라스틱 형으로 클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
