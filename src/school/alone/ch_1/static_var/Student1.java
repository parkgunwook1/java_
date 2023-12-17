package school.alone.ch_1.static_var;

public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student1() {
        serialNum++;
        studentID = serialNum;    // 학생이 증가할 때마다 증가된 값을 학번 인스턴스 변수에 부여/ 만약 대입 안시키면 모든 인스턴스가 동일한 학번 값을 가지게 됨.
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
}
