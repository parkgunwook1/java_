package algorithm.ch1_programmers_0.main;

import java.util.Scanner;


public class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i <= k; i++ ) {
            answer += my_string;
        }
        return answer;
    }

   public void method1() { // 문자열 돌리기
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
    public void method2() {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

                if (n % 2 == 0) {
                    System.out.println(n + " is even");
                } else {
                    System.out.println(n + " is odd");
            }
        }
    public void method3() {
        // 문자열 my_string, overwrite 와 정수 s가 주어짐
        // 문자열 my_string 의 인덱스 s부터 overwrite 길이 만큼 overwrite 으로 바꾼 문자열 return solution 함수 작성

    }
}

