package school.ch1.together.study.ch17_api.ch2_string.controller;

import java.util.Arrays;

public class B_StringMethodTest {

    public void method() {
        String str1 = "Hello World";

        // 1. 문자열.charAt(int index) : char
        // 문자열에서 전달받은 index의 위치에 있는 문자 하나만 뽑아서 반환
        char ch = str1.charAt(4);
        System.out.println("ch : " + ch); // o

        // 2. 문자열.concat(String str) : String
        // 문자열과 전달된 문자열을 하나로 합쳐서 반환
        String str2 = str1.concat("~!~!");
        System.out.println(str2);

        // 3. 문자열.length() : int
        // 문자열 길이 반환
        System.out.println(str2.length());

        //4. subString(int beginIndex) : String
        // 문자열의 beginIndex 위치에서부터 끝까지 문자열을 추출해서 리턴

        // 문자열.substring(int beginIndex, int endIndex) : String
        //         => beginIndex 부터 endIndex-1 까지 문자열 추출해서 리턴
        System.out.println(str1.substring(4,7));
        System.out.println(str1.substring(4));

        // 5. 문자열.replace(char old, char new) : String
        //      => 현재 문자열에서 old 문자를 new 문자로 대체(replace) 하고 변환된 문자열 리턴
        String str3 = str1.replace('l','a');
        System.out.println("str3 : " + str3);

        // 6. 문자열.trim() : String
        //    -> 문자열의 앞 뒤 공백을 제거한 문자열 리턴
        String str4 = "                 kava         ";
        System.out.println(str4.trim());

        // 7. 문자열.toUpperCase() : String
        //          => 문자열을 모두 다 대문자로 변경 후 문자열 리턴
        //    문자열.toLowerCase() : String
        //          => 문자열을 모두 다 소문자로 변경후 리턴.
        System.out.println("upper : " + str1.toUpperCase());
        System.out.println("Lower : " + str1.toLowerCase());

        // 8. 문자열.toCharArray() : char[]
        //        => 문자열의 각 문자들을 char[] 배열에 옮겨 담은 후 해당 배열을 리턴
        char[] arr = str1.toCharArray();
        System.out.println(Arrays.toString(arr));

        // 9. static valueof(char[] data) : String
        System.out.println(String.valueOf(arr));
        System.out.println(String.valueOf(1));
    }

}
