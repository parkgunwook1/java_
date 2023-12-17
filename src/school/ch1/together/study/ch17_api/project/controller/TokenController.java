package school.ch1.together.study.ch17_api.project.controller;

import java.util.StringTokenizer;

public class TokenController {

    public TokenController() {}

    public String afterToken(String str) {
        StringTokenizer st = new StringTokenizer(str, " ");

        String result = "";

        while (st.hasMoreTokens())
            result += st.nextToken(); // J A V A .... 하나씩 츨력
        //==============================================================
        System.out.println("============ split ==============");
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }

    public String firstCap(String input) {
        // 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
        // java -> j J > Java

        String result = "";
        StringBuilder sb = new StringBuilder();
        // 1반복문 활용
        for (int i = 0; i < input.length(); i++) {
            char ch = (char)(input.charAt(i) - (i == 0 ? 32 : 0)); // 아스키 코드 32를 빼먄 대문자가 소문자됨.

            sb.append(ch);
        }
        return sb.toString();

        }
    public int findChar(String input, char one) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == one) {
                count++;
            }
        }
        return count;
    }
}