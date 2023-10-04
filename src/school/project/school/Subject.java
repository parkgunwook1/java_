package school.project.school;

import school.project.utils.Define;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectId;
    private int gradeType;

    private ArrayList<Student> studentList = new ArrayList<Student>(); // 이 과목을 수강 신청한 학생 리스트, register 메서드 호출하면 이 리스트에 추가됨

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE; // 일반과목
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public int getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public int getGradeType() {
        return gradeType;
    }
    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }
    public void register(Student student) {  // 수강신청 메서드
        studentList.add(student);
    }
}
