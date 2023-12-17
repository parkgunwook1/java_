package study.bookstudy.ch4;

public class Example_1 {
    public static void main(String[]args) {
        Parent_1 p1 = new Parent_1();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("-------------------");

        Child_1 c1= new Child_1();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("-------------------");

        Parent_1 p2 = new Child_1();
        System.out.println(p2.i);    //필드는 타입을 따라간다.
        p2.printI();
    }
}
