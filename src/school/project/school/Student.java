package school.project.school;

import java.util.ArrayList;

/*학생 클래스 = 학번, 이름, 필수과목, 수강한 과목 점수 리스트
과목 클래스 = 과목 이름, 과목 고유 번호, 학점 산출 방식, 수강 신청한 학생 리스트
점수 클래스 = 학번, 과목, 점수*/
public class Student {
    private int studentId;
    private String studentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<Score>(); // addSubjectScore() 메서드가 호출되면 이 리스트에 추가된다.

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }
    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Subject getMajorSubject() {
        return majorSubject;
    }
    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }
    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
