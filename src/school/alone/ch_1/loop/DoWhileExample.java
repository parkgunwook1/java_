package school.alone.ch_1.loop;

public class DoWhileExample {
    // do-while문은 { } 안의 문장을 무조건 한 번 수행한 후에 조건식을 검사한다.
    // 즉, 조건이 만족하는지 여부를 마지막에 검사하는 것이다.
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num; //sum = sum + num
            num++;
        }while(num <= 10);

        System.out.println("1부터 10까지의 합은" + sum + "입니다.");
    }
}
