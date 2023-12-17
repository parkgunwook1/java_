package school.ch1.together.study.ch16_abstractandinterface.run;

import school.ch1.together.study.ch16_abstractandinterface.model.Basketball;
import school.ch1.together.study.ch16_abstractandinterface.model.Football;
import school.ch1.together.study.ch16_abstractandinterface.model.Sports;

public class Run {
    public static void main(String[] args) {

        Sports s;
        s = new Football();

        // 객체배열
        Sports[] arr = new Sports[2];  // 객체배열은 객체를 직접 생성하는 것이 아니라 arr 참조변수를 배열로 만든것이라 가능하다.
        arr[0] = new Football(12);
        arr[1] = new Basketball(6);

        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]); // toString 메서드 재정의한 것 출력
            arr[i].rule(); // 추상 메서드 rule 메서드 출력
        }

    }
}
