package school.ch1.together.study.ch22_thread.chap02_scheduling.scheduling;

public class Car implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 20; i++) {

            System.out.println("Car is driving...");

            try {
                Thread.sleep(100); // 스레드를 0.1초만큼 지연 시키는 메소드
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
