package school.ch1.together.study.ch22_thread.thread_1;

import school.ch1.together.study.ch22_thread.thread.Thread1;
import school.ch1.together.study.ch22_thread.thread.Thread2;

public class ThreadRun {
    public static void main(String[] args) {

        /*
         * 프로그램
         * - 어떤 작업(프로세스)을 실행할 수 있는 파일 (cpu 로부터 메모리를 할당받지 못한 상태)
         *
         * 프로세스
         * - 현재 동작하고 있는 프로그램 (작업을위해 cpu 로부터 메모리를 할당 받음.)
         *
         * 스레드
         * - 한 개의 프로세스내에서 실제로 주어진 자원과 메모리로 작업을 수행하는 최소 단위
         * - 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행
         *
         * ex)
         * - 바닥청소 (나, 1시간) + 빨래(세탁기, 2시간) + 설거지(나, 30분) + 화장실 청소(나, 30분)
         * - 2시간걸림. -> 무조건 있어야하는 중심이되는 스레드 (나) => 메인스레드 , 메인스레드가 실행하는
         *                서브스레드 (세탁기)
         * - 추가로 필요한 스레드 = 서브스레드 = main 에서 생성해서 실행한다.
         *
         * 멀티스레드
         * - 한 개의 프로그램을 실행하고 그 내부적으로 여러 작업을 처리하는것
         * - 멀티스레드의 장점
         * 1) 자원을 효율적으로 사용
         * 2) 사용자 입장에서 일처리가 빠르게 보인다.
         * 3) 작업이 분리되어서 코드가 간결해진다.
         * */

        // 모든 자바어플리케이션 Main Thread가 Main 메서드를 실행하면서 시작된다.
        // throw new Error();  // main 스레드에서 에러 발생

        // 싱글스레드 작업방식
        // 항상 앞 라인의 명령문이 다 끝난후에 코드가 실행된다.
        for (int i = 1; i <= 100; i++) {
            System.out.println("작업 1 [" + i + "]");
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("작업 2 [" + i + "]");
        }
        // 작업 2를 수행하게 하기 위해서 새로운 스레드를 생성
        // 스레드 생성방법 1 : Thread 클래스 상속받기
        Thread th1 = new Thread1();

        // 스레드 이름지정
        th1.setName("스레드1");

        // run 은 재정의한 것.
        // 스레드 시작시 start
        th1.start();

        // 스레드 생성방법 2 : Runable 인터페이스를 구현하는 방법
        Thread th2 = new Thread(new Thread2(),"스레드2");

        th2.setName("스레드2");

        th2.start();

        // 스레드 생성방법 3 : 익명인터페이스 (1회용 스레드가 필요할때)
        // 클래스 생성없이 run 메서드만 현재 스레드에서만 사용할 목적으로 구현

        Thread th3 = new Thread() {
          @Override
          public void run() {
              for (int i = 1; i <= 100; i++) {
                  System.out.println(getName()+ "[" + i + "]");
              }
          }
        };
        th3.start();

        System.out.println("메인스레드 종료");

        /*
        * 스레드의 특징
        * 1. 메인스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
        *    - > 메인스레드 종료시 서브스레드도 종료시키게 하려면, 메인과 서브 스레드간에 주종관계를 설정하면 된다.
        * 2. 매번 결과가 다르게 보인다.
        *    -> 각 스레드의 실행시점은 스케줄러라는 녀석이 따로 결정해주기 때문에.
        * 3. 멀티스레드 환경에서는 모든 작업이 동시에 일어나는것처럼 보이지만 사실 "한순간에 하나의 스레드만 실행" 되고 있다.
        *    (a스레드 실행 -> a스레드 멈춤 -> b스레드 실행 -> b스레드 멈춤 -> c스레드 실행 -> c스레드 멈춤 ...)
        *    이 과정들이 순식간에 발생하기 때문에 우리눈에는 동시에 스레드가 작동하고 있는것처럼 보인다.
        *    왜 스레드는 이런방식으로 작업을 처리하는가?
        *    1. 하드웨어적인 한계
        *    2. 논리적 효율 => 만약 용량이 엄청나게 큰 파일을 다운로드 받는다고 할 때, 파일을 다운로드받는 동안 아무작업도 못한다면?
        *                    그것보다는 기타 다른 작업도 실행하면서 동시에 다운로드도 받게 해주는게 작업 효율이 좋을것이기 때문에
        *                    => 더 빠른 반응성을 가져다줌.
        * * 컴퓨터의 특징 *
        * 1. 프로그램을 실행시키기 위해서는 프로그램을 실행시킬수 있는 자원들을 cpu로부터 할당받아야한다.
        *
        * 따라서 스레드는 프로그램을 실행하기 위해 cpu 자원을 할당받았다가, 이 자원을 스케줄러에게 강탈당한다.
        * 그렇기 때문에 명렬어들이 연속적으로 수행되지 못하고, 어느부분까지 명령을 수행했는지 스레드별로 개별적으로 기억함할 필요가 생겼다.
        * 이 명령어들을 기억하는 저장공간이 Registre 이고 스레드별로 개별적은 Reguster를 가지고 있다.
        *
        * 개별적인 실행흐름을 보장하기 위해 스레드는 메모리 영역중 stack을 각각 할당 받는다.
        *
        * */
    }


}
