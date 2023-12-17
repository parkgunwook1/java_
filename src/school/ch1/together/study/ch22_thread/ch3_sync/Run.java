package school.ch1.together.study.ch22_thread.ch3_sync;

public class Run {

    public static void main(String[] args) {

        Acount acc = new Acount();
        Thread atm1 = new Thread(new Atm(acc), "atm1");
        Thread atm2 = new Thread(new Atm(acc), "atm2");

        atm1.start();
        atm2.start();
        /*
        * 하나의 공유자원에 동시에 여러개의 스레드가 달라붙어서 접근하는 상황을 경쟁상태라고 부른다.
        * 이를 방지하기 위해 하나의 공유자원에 하나의 스레드만 접근가능하도록 통제를 해야하는데,
        * 그 통제가 필요한 영역을 임계영역이라고 부른다.
        * 임계영역을 통제하기 위하여 synchronized 키워드를 추가한다.
        * */

        System.out.println("메인 스레드 종료");
    }
}
