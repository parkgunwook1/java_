package school.ch1.together.study.operator;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
            // 사용자로부터 입력받은 영문자가 대문인지 아닌지 판별후 출력
            Scanner sc1 = new Scanner(System.in);
            char a = sc1.nextLine().charAt(0);

            String result = ('A' <= a && a <= 'z')?  "소문자 입니다." : "대문자 입니다.";
            System.out.printf("%c는 %s \n",a,result);
            // 입력에서 : 영문자 한개만 입력:
            // 출력에서 : 대문자입니다 or 대문자가 아닙니다.
    }
}
