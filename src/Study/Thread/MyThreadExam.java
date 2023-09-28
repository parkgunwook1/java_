package Study.Thread;

public class MyThreadExam {
    public static void main(String[] args) {
        // 1초마다 *를 10번 출력하는 프로그램 작성
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
