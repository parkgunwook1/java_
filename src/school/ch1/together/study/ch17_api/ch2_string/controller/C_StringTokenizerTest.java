package school.ch1.together.study.ch17_api.ch2_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
    public void method() {
        String str = "Java Oracle JDBC HTML CSS JAvaScript Server";

        // 구분자를 제시해서 해당 문자열을 분리시키는 방법.
        // 방법1. 분리된 문자열들을 String[] 배열에 담아서 관리하는 방법.
        //     문자열.split(구분자) : String[]
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==========="); // for each문
        // 인덱스에 순차적으로 접근하기 위한 목적으로만 사용할 것을 권장.
        for ( String str1 : arr) {
            System.out.println(str1);
        }
        // 방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을때
        // java.uti;/StringTokenizer 클래스를 이용한다.
        // StringTokenizer stn = new StringTokenizer(분리싴자 하는 문자열, 구분자);
        StringTokenizer stn = new StringTokenizer(str," ");

        System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());

        // 현재 token의 순서 1
        System.out.println(stn.nextToken()); //
    }
}
