package school.alone.ch_1.array.arraylist;

import java.util.ArrayList;

public class Student {
    // 배열을 사용하는 중에는 배열 길이를 변경할 수 없기 때문에 코드를 수정해야한다.
    // 배열을 쉽게 변경 사용할 수 있도록 ArrayList 를 제공한다.

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }
    public void showStudentInfo() {
        int total = 0;
        for(Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println("학생" + studentName + "의" + s.getName() + "과목 성적은" + s.getScorePoint() + "입니다.");
        }
        System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
    }

}
