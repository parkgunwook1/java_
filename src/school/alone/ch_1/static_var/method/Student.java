package school.alone.ch_1.static_var.method;

public class Student {
    // private 으로 선언하고 변수에 대한 get() 메서드와 set() 메서드를 생성한다.
    // 클래스 메서드는 내부에서 인스턴스 변수를 사용할 수 없다. 그리고 인스턴스가 생성되지 않아도 언제든 호출할 수 있다.
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }
    public void setStudentName(String name){
        studentName = name;
    }
    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }
    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
