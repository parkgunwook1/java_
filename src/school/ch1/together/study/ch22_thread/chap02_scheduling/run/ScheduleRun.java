package school.ch1.together.study.ch22_thread.chap02_scheduling.run;

import school.ch1.together.study.ch22_thread.chap02_scheduling.scheduling.*;

public class ScheduleRun {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Car(),"Car");
        Thread t2 = new Thread(new Plane(),"Plane");
        Thread t3 = new Thread(new Tank(),"Tank");


        /*
        * 우선순위 변경 전
        * 각 스레드는 기본값으로 5의 우선순위를 가지고 있다.
        * 메모리가 모자랄때 우선순위를 파악해서 어떤 작업을 먼저 실행시킬지 정할 수 있다.
        * 스레드의 우선순위를 정하지 않으면 스케줄러가 임의로 수행 시킨다.
        *
        * 스레드는 Cpu를 할당받았다가 스케쥴러에 의해 다시 선점당한다.
        * 그렇기 때문에 명령어의 실행이 연속적이지 못하고 어느부분까지 수정했는지 기억할 필요가 있다.
        * */
        System.out.println("--------우선순위 변경 전 ---------");
        System.out.println(Thread.currentThread().getName()+"의 우선순위 : " + Thread.currentThread().getName());
        System.out.println(t1.getName()+"의 우선순위" + t1.getPriority());
        System.out.println(t2.getName()+"의 우선순위" + t1.getPriority());
        System.out.println(t3.getName()+"의 우선순위" + t1.getPriority());

        // setPriority() : 우선순위를 지정해주는 메소드
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t3.setPriority(Thread.MIN_PRIORITY); // 1

        System.out.println("--------우선순위 변경 후 ---------");
        System.out.println(Thread.currentThread().getName()+"의 우선순위 : " + Thread.currentThread().getName());
        System.out.println(t1.getName()+"의 우선순위" + t1.getPriority());
        System.out.println(t2.getName()+"의 우선순위" + t1.getPriority());
        System.out.println(t3.getName()+"의 우선순위" + t1.getPriority());

        /*
        * 메인 스레드가 종료되더라도 실행중인 스레드가 하나라도 있으면 프로세스는 종료되지 않는다.
        * 이에 대한 해결책으로 스레드를 생성(start()) 하기 전에 스레드간의 주종관계를 설정하며 ㄴ된다.
        *
        * 주종관계 설정
        * main스레드가 종료시 다른 스레드로 종료시키기 위해서는 setDaemon 함수를 사용
        * 주의점으로는 스레드중 한개라도 setDaemon을 설정했다면 모든 스레드에 setDaemon을 해줘야 정상작동한다.
        * */
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
