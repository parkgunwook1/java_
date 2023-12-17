package school.alone.ch_1.static_var;

public class Student {
    // static 변수는 프로그램이 실행되어 메모리에 올라갔을 때 딱 한 번 메모리 공간이 할당된다. 그 값은 모든 인스턴스가 공유한다.

    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
}
