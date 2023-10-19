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
        if (input != null && !input.isEmpty()) {
            return Character.toUpperCase(input.charAt(0)) + input.substring(1);
        } else {
            return input;
        }
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