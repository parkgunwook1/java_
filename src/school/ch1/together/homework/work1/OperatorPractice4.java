package school.ch1.together.homework.work1;

import java.util.Scanner;

public class OperatorPractice4 {
    public void practice5() {
        Scanner sc = new Scanner(System.in);


        System.out.println("주민등록 번호를 (- 빼고) 입력하세요 :");
        char str = sc.nextLine().charAt(6); // 인덱스 6에서 뒷자리 첫 번째 숫자 추출

        String result = (str == '1' || str == '3') ? "남자" : "여자";

        System.out.println(result);
    }
}
