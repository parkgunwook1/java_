package school.ch1.together.study.ch9_object.run;

import school.ch1.together.study.ch9_object.abstraction.model.Student;

public class Run {
    // 1. 객체란? 사전적 의미로는 현실세계에 독립적으로 존재하는 모든 것.
    // 자바에서 객체 = 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것 ( 힙 메모리 )

    // 2. 객체지향언어 : 객체를 지향하는 언어로 객체중심으로 돌아가는 언어.

    // 3. 객체지향 프로그래밍 : 현실세계의 객체간의 상호작용을 프로그래밍 통해 가상세계로 구현하는 과정

    // 4. 구현하고자 하는 프로그램상의 필요한 객체를 만들기 위해서는 클래스라는 틀을 먼저 만들어야 함.
    // => 클래스란 ? 각 객체들의 속성(구성요소) 들을 담아낼 수 있는 그릇과도 같은 존재
    // => 추상화와 캡슐화 과정을 거쳐 클래스를 만들수 있음.

    // 5. 추상화 과정
    //  1) 내가 구현하고자 하는 프로그램에서 필요한 객체들을 생각해볼것 ex ) 학생관리프로그램 -> 학생,객체,선생님, ...
    //  2) 그 객체들이 가지고 있는 공통적인 속성, 기능들을 모두 추출할 것 ex) 이름, 나이, 성별, 주소 등등
    //  3) 그렇게 추려진 속성들을 가지고 내가 구현한 프로그램의 실질적인 목적에 맞춰서 불필요한 속성과 기능은 제거하기
    //  4) 최종적으로 추려진 속성 및 기능을 가지고 어떤 자료형에 어떤 이름으로 사용할 것인지 생각해보기.
    public static void main(String[] args) {

        // Student 클래스 생성해보기
        // Student 클래스 만들고 나서 객체 생성 - 홍길동 객체 만들기
        Student hong = new Student("홍길동",20,155.5); // 객체생성 완료.
        System.out.println("이름 : " +  hong.getName());
        System.out.println("나이 : " + hong.getAge());
        System.out.println("키 : " + hong.getHeight());

        Student park = new Student("박건욱",24,178.1);
        System.out.print(park.getName()+"님의" + park.getAge() + "살이고 키는" + park.getHeight() + "입니다.");



    }
}
