package study.project.Lotto_1;

// 인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩할 필요가있다.
public class LottoMachineImpl implements LottoMachine{
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;

    }

    // Math.random() ==> 0.0 <= x 1.0
    @Override
    public void mix() {
        for (int i = 0; i < 10000; i++) {
            int x1 = (int)(Math.random() * MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * MAX_BALL_COUNT);
            if (x1 != x2) {
                Ball tmp = balls[x1]; // 값을 치환할때는 같은 type의 임시변수가 필요하다.
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }

    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[RETURN_BALL_COUNT]; // Ball 6개를 참조할 수 있는 배열
        for (int i = 0; i < RETURN_BALL_COUNT; i++) {
            result[i] = balls[i];
        }
        return result;
    }
}
