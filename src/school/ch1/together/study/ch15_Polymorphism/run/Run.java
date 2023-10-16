package school.ch1.together.study.ch15_Polymorphism.run;

import school.ch1.together.study.ch15_Polymorphism.model.*;

public class Run {
    public static void main(String[] args) {
        System.out.println("1. 부모타입 래퍼런스 변수로 부모타입 객체 다루기. "); // 래퍼런스 변수 -> 한국말로 참조자료 변수
        Parent p1 = new Parent();
        p1.printParent();

        System.out.println("2. 자식타입 래퍼런그 변수로 자식객체를 다루는 경우");
        Child1 c1 = new Child1(); // 생성자에 슈퍼클래스 생성자 호출하는 구문이 항상 자동으로 들어가 있음.
        c1.printChild1();
        c1.printParent(); // 부모클래스의 메서드 상속받아서 가능.
        /*
        * child1 래퍼런스 변수로 Parent, Child에 있는 필드 및 메서드 둘 다 접근 가능
        * Child1 래퍼런스변수가 Parent에 있는 메소드에 접근시 자동으로 "형변환"이 진행됨.
        * 자식에서 부모클래스로는 자동형변환(업캐스팅) -> 자긍ㄴ것에서 큰덧으로 형변환 된것과 같은이치
        *  ex ) ((Parent)c1).printParent(); <- 자동으로 형변환 됨.
         * */

        System.out.println("3. 부모타입 래퍼런스 변수로 자식 객체를 다루는 경우(다형성 적용) ");
        Parent p2 =  new Child1(); // 실제로 참조하고 있는 클래스는 Child1 이다.
        Parent p3 = new Child2();

        /*
        * = 연산자 기준으로 왼쪽과 오른쪽 자료형이 다름
        * 오른쪽의 자식클래스가 Parent 자료형으로 자동형변환이 되고있기 때문에 오류가 없음
        *  즉 , 상속구조에는 클래스간의 형변환이 가능하다.
        * */
        p2.printParent(); // 부모클래스 참조형 변수로 Parent 클래스 내부 메소드 참조. > 이상없음
//        p2.printChild1(); -> 오류난다. Child1 에 접근하려면 자식 자료형이 되어야한다. 부모 클래스는 자료형이 다르므로 접근 안된다.
        ((Child1)p2).printChild1(); // 자식객체로 접근하고 싶을때 Child1 자료형으로 강제형변환 후 진행


        /*
        * 클래스 간에도 형변환 가능( 단, 상속구조일 경우에만)
        *
        * 1. UpCasting
        *     자식타입 -> 부모타입으로 형변환
        *     생략가능(자동형변환 개념)
        *     ex)
        *     부모 변수 = new 자식객체 - > 자동형변환
        *
        * 2. DownCasting
        *     부모타입 -> 자식타입으로 형변환
        *     생략불가능(강제형변환 해야함)
        *     ex)
        *      ((자식)부모).자식메서드();
        *
        * 다형성을 쓰는 이유
        * - 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 하나로 다룰수 있음.
        * */

        // 다형성 장점
        // 다형성 배우기전 Child1 객체 2개를
        // 다형성 배우기전 Child2 객체 2개로 다룬다.
        // 객체 배열로 관리한다.
        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1,2,3);
        arr1[1] = new Child1(4,5,6);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(1,2,3);
        arr2[1] = new Child2(4,5,6);

        // 단, 다형성이 적용되면 부모타입 래퍼런스 변수 "하나"로 모든 자식객체를 다 받아줄수 있다.
        // 다형성을 접목한 객체배열.
        Parent[] arr = new Parent[4];
        arr[0] = new Child1(1,2,3);
        arr[1] = new Child1(4,5,6);
        arr[2] = new Child2(1,2,3);
        arr[3] = new Child2(8,8,8);
        // 하나의 타입으로 모든 자식 객체들을 다 받을수 있음 => 코드수 감소, 생산성 증대, 유지보수 편리

        ((Child1)arr[0]).printChild1();
        ((Child1)arr[1]).printChild1();
        ((Child2)arr[2]).printChild2();
        ((Child2)arr[3]).printChild2();

        System.out.println("반목문을 활용해 출력");
        for (int i =0; i < arr.length; i++) {

            // 현재 참조하고 있는 래퍼런스 변수(Parent)가 실제로 어떤 객체타입(Child1, Child2)을 참조하고있는지 확인할 수 있는 연산자.
            // instanceof 자료형
//            if (arr[i] instanceof Child1) { // arr[i]가 실제로 참조하고있는 객체타입이 Child1 이라면 true, 아니면 false
//                ((Child1)arr[i]).printChild1();
//            }else {
//                ((Child2) arr[i]).printChild2();
            arr[i].print();
            /*
            * 동적 바인딩 : 프로그램이 실행되기전에 자동으로 컴파일되면서 정적으로는 현재 래퍼런스변수(Parent)의 메소드를 가리키게됨.
            *     => ctrl + 좌클릭으로 확인
            *                   단, 참조하고 있는 자식클래스에 해당 메소드가 "오버라이딩" 되어 있다면 프로그램 시작할 때는 동적으로 그
            *                   자식 클래스의 오버라이딩된 메소드를 찾아서 실행하게됨.
            *                   (실제로 실행시 자식클래스의 재정의된 메소드가 실행 -> 동적바인딩
            *                    컴파일 단계에서 참조하고있는 래퍼런스 변수의 메소드를 실행한다고 가리키는 것 -> 정적바인딩
            *
            * */
        }
    }
}
