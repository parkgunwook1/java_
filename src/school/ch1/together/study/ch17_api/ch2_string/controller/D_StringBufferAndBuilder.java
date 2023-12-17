package school.ch1.together.study.ch17_api.ch2_string.controller;

/*
* String 불변클래스 immutable
* StringBuffer 와 String Builder?  mutable 클래스
*
* 문자열 연산이 빈번하게 일어나는 프로세스 / 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
* 기본적으로 두개의 클래스는 동일한 메소드를 지니며, 차이점은 동기화 여부
*
* StringBuffer는 멀티스레드환경에서 유용하며
* StringBuilder는 싱글스레드 환경에서 유용하다.
* */
public class D_StringBufferAndBuilder {

    public void method() {
        String str = "hello";
        str += "world";

        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");

        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append("world");

        System.out.println(sb);
        System.out.println(sb2);

        System.out.println("sb의 길이는 ? " + sb.length());

        System.out.println("o의 위치는 ? " + sb.indexOf("o")); // indexOf는 문자열 찾아줄 수 있음.
                                                             // lastindexof() 는 뒤에서부터 찾는다.

        String filename = "TEST.ABC.txt";
        String filename2 = filename.substring(0 , filename.lastIndexOf("."));
        System.out.println("TEST.ABC.txt에서 확장자를 제외한 파일명? " + filename2);

        // 인덱스위치의 문자를 없애는 메소드
        // 마지막위치의 문자를 없애고싶다?
        // 마지막 위치 => 문자열의 길이 -1
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        // 내가 원하는 위치의 인덱스부터 내가 정한 마지막 인덱스까지 삭제
        // 시작 인덱스 <= 인덱스범위 < 종료 인덱스
        System.out.println(sb.delete(0, sb.length()));

        System.out.println("sb :" + sb);
    }
}
