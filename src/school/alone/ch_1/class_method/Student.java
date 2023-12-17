package school.alone.ch_1.class_method;

//라이브러리 클래스에 필드,생성자,메서드를 만든다.
// 메인 클래스에 클래스를 Student student = new Student() 로 불러온다.
// 변수 student.해서 라이브러리 클래스에 있는 것을 불러온다.
// 메인 클래스와 라이브러리 클래스와 같이 있으면 모든 클래스가 메인 클래스가 있어야 한다. 나눠서 작성하는게 좋다.

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student student = new Student();  //Student 클래스 생성
        student.studentName = "박건욱";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
    }
}
