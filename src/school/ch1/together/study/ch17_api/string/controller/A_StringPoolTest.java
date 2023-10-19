package school.ch1.together.study.ch17_api.string.controller;

public class A_StringPoolTest {

    // 생성자를 통한 문자열 담기
    public void method1() {

        String str1 = new String("hi");
        String str2 = new String("hi");

        System.out.println(str1 == str2);
        System.out.println(str1);
        System.out.println(str1.toString());

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // System.idenityHashCode 주소값 알고싶을 때 사용
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

    // 2. 문자열을 리터럴로 생성
    public void method2() {

        String str = new String("hello");

        // 리터럴값은 상수풀(String pool) 에 올라감
        String str1 = "hello";
        String str2 = "hello";


        System.out.println(str1 == str2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str.hashCode());

        System.out.println("============");

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

    // 불변클래스
    public void method3() {
        String str = "Hello";
        System.out.println(System.identityHashCode(str));

        str = "goodbye";
        System.out.println(System.identityHashCode(str));

        str = "Hello";
        System.out.println(System.identityHashCode(str));

        str += "good";
        System.out.println(System.identityHashCode(str));

    }
}
