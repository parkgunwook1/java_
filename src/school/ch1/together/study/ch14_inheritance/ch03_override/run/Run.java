package school.ch1.together.study.ch14_inheritance.ch03_override.run;

import school.ch1.together.study.ch14_inheritance.ch03_override.model.Book;

public class Run {
    public static void main(String[] args) {

    Book b = new Book("수학의 정석","김길동", 15000);
        System.out.println(b.toString());
        /*
        * 출력문 안에 참조형 변수(래퍼런스 변수)를 제시해서 출력하고자 할 때, 내부적으로 jvm 이 자동으로 toString() 메소드를 호출한다.
        *
        * 부모클래스인 Object 클래스에 있는 toString()
        * 해당 참조형의 풀클래스명 + @ + 해당객체의 주소값
        *
        * 자식 클래스인 Book 클래스에서 toString() 메소드 재정의시
        * 해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려줄 수 있다.
        *
        * 모든 클래스는 Object 클래스의 후손이다. 즉 항상 최상위클래스는 object
        * => 즉, Object에 있는 모든 메소드들을 다 가져다쓸 수 있음.
        * => 마음에 들지 않으면 오버라이딩 가능
        * */

        // toString 메소드 오버라이딩 전:
        // 16진수 주소값
        // toString 메소드 오버라이딩 후:
        // 매개변수에 전달한 문자열 출력
   }
}
