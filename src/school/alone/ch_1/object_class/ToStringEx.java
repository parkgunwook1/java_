package school.alone.ch_1.object_class;

class Book {
    // String, Integer 같은 클래스는 java.lang 패키지에 속해있다. java.lang 패키지는 컴파일할 때 자동으로 추가된다.
    // Object 클래스는 최상위 클래스이다. 컴파일 과정 자동으로 extends Object 가 자동으로 쓰인다.
    // Object 클래슬르 상속 받았음으로 모든 클래스가 Object의 메서드를 사용할 수 있고, 재정의할 수도 있고, Object 형으로 반환되는 경우도 있다.

    // toString() 메서드 : 객체(인스턴스) 정보를 문자열로 바꾸어 준다. 인스턴스의 클래스 이름과 주소 값을 보여준다.
    // equals() 메서드 : 두 인스턴스의 주소를 비교해 true/false 반환

    int bookNumber;
    String bookTitle;

    Book(int bookNumber,String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle =bookTitle;
    }

    @Override
    public String toString() {  // toString() 메서드 재정의 / 메서드를 직접 재정의하면 객체의 참조 변수를 이용해 원하는 문자열을 표현할 수 있다.
        return bookTitle + "," + bookNumber;
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Book boo1 = new Book(200,"개미");

        System.out.println(boo1);
        System.out.println(boo1.toString());

        System.out.println("----------------------- toString 메서드 ------------------------------------");

        String str1 = new String("abc");  // 두 인스턴스 주소 값이 같은지 비교하여 출력
        String str2 = new String("abc");  // 두 인스턴스의 문자열 값이 같은지 비교하여 출력

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
