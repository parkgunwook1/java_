package school.ch1.together.study.ch18_exception.digram_project2.controller;

import school.ch1.together.study.ch18_exception.digram_project2.exception.NumRangeException;

public class NumberController {

    public NumberController() {
    }
    public boolean checkDouble(int num1, int num2) throws NumRangeException {
        if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
            if (num1 % num2 == 0) {
                return true;
            }
        }else {
            throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
        }
                return false;
    }
}
