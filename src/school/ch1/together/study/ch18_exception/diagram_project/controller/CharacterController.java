package school.ch1.together.study.ch18_exception.diagram_project.controller;

import school.ch1.together.study.ch18_exception.diagram_project.exception.CharCheckException;

public class CharacterController {

    public CharacterController() {
    }

    public int countAlpha(String s) throws CharCheckException {
        // 매개변수로 들어온 값에 영문자가 몇개 들어있는지 반환

        if (s.indexOf(" ") > -1) {
            throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
        }

        // 문자열의 길이만큼 반복, 각 문자가 영문자인지 아닌지 체크
        // 영문자라면 갯수를 세어서 총 갯수 반환
        int count = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char currentVal = s.charAt(i);
            if (currentVal >= 'A' && currentVal <= 'Z') { //영문자라면
                count++;
            }
        }
        return count;
    }
}
