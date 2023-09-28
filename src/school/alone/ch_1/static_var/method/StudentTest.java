package school.alone.ch_1.static_var.method;

public class StudentTest {
    public static void main(String[] args) {
        // private 으로 SerialNum 변수를 선언해서 get,set 메소드를 사용해서 접근해야 한다. 안그러면 오류가 난다.

        Student studentPark = new Student();
        studentPark.setStudentName("박건욱");
        System.out.println(Student.getSerialNum());
        System.out.println(studentPark.studentName + "학번 : " + studentPark.studentID);

        Student studentLee = new Student();
        studentLee.setStudentName("임도원");
        System.out.println(Student.getSerialNum());
        System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);
    }
}
