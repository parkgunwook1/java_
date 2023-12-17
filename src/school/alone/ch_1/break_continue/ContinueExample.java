package school.alone.ch_1.break_continue;

public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for (num = 1; num <= 100; num++) {
            if (num % 2 == 0)              // 홀수인 경우에만 덧셈
                continue;                  // continue 문은 num % 2  = 0 일 때 생략한다.
            total += num;
        }
        System.out.println("1부터 100까지 홀수의 합은: " + total + "입니다.");
    }
}

