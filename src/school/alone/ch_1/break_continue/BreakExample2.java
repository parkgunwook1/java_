package school.alone.ch_1.break_continue;

public class BreakExample2 {
    // break 문은 내부 반복문을 빠져 나오고, 외부 반복문은 실행한다.
    // continue 문은 반복문을 계속 수행하지만 특정 조건에서 수행문을 생략하는 경우에 사용한다.

    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        for(num = 0; ; num++) {        // 조건식을 생략하는 대신 break문을 사용한다.
            sum += num;
            if(sum >= 100)             // sum이 100보다 크거나 같을 때(종료 조건)
                break;                 // 반복문 중단.
        }
        System.out.println("num : " + num);
        System.out.println("sum :" + sum);
    }
}
