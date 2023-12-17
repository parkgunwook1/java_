package school.ch1.together.study.ch19_io.file.run.ch04_assist.run;

import school.ch1.together.study.ch19_io.file.run.ch04_assist.model.dao.BufferedDao;

public class BufferedRun {

    public static void main(String[] args) {



    /*
     * 보조 스트림
     * 기반 스트림(외부 매체와 직접 연결할수있는 기능)의 부족한 기능들을 확장시킬수 있도록 도와주는 스트림
     * 보조스트림은 단독으로는 사용할수가 없음 == 단독으로 객체생성불가.
     *
     * [표현법]
     * 보조스트림 변수명 = new 보조스트림(기반스트림객체 (필수) );
     *
     * BufferedXXX : 속도 성능 향상 목적의 보조 스트림
     * = > Buffer 라는 저장공간을 제공해서 입출력때 필요한 데이터를 란번에 모아뒀다가 한꺼번에 입출력 진행.
     *
     * */

    BufferedDao bd = new BufferedDao();
    bd.fileRead();
    }
}
