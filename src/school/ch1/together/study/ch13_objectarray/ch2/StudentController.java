package school.ch1.together.study.ch13_objectarray.ch2;

public class StudentController {

    public final static int CUT_LINE = 60;
    // 객체 배열 생성하고 그 배열을 5개의 요소를 초기화 하는 것이다.
    private Student[] sArr = new Student[5];

    // 5개의 객체배열을 샘플 데이터값으로 초기화 해주는 기본 생성자
    public StudentController() {
        sArr[0] = new Student ("김길동","자바",100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("이길동","화면",85);
        sArr[3] = new Student("정길동","서버",60);
        sArr[4] = new Student("홍길동","자바",20);

    }
    // 객체 배열에 있는 데이터 반환
    public Student[] printStudent() {
        return sArr;

    }
    // 객체 배열 점수합계 반환
    public int sumScore() {
        int sum = 0;
        for (int i = 0; i < sArr.length; i++) {
            sum += sArr[i].getScore();
        }
        return sum;
    }
    // double 베열 생성 후 sumScore 리턴값 0 번째 인덱스 저장해 합의 평균 1번째 인덱스에 저장후 배열 리턴
    public double[] avgScore() {
        double[] dArr = new double[2];
        dArr[0] = sumScore();
        dArr[1] = sumScore() /sArr.length;

        return dArr;
    }
}
