package school.alone.ch_1.loop;

public class NestedLoop {
    public static void main(String[] args) {

        // 반복횟수가 정해진 경우는 for 문을 사용
        // 수행문을 반드시 한 번 이상 수행해야 하는 경우에 do-while 문 사용
        // 조건이 참-거짓에 따라 반복문이 수행하는 경우는 while 문 사용


        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
