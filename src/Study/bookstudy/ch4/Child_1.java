package study.bookstudy.ch4;

public class Child_1 extends Parent_1 {
    public int i = 5; //필드 오버로딩

    public void printI() { //메소드 오버로딩
        System.out.println("child - printI() : " + i);
    }
}
