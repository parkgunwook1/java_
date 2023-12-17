package school.alone.ch_1.class_method;

public class StudentTest {
    public static void main(String[] args) {
        // main() 함수가 포함된 클래스로부터 프로그램이 시작한다.
        // 패키지가 다르면 import 문을 사용해서 클래스를 불러와야 한다.
        // 패키지가 다르면 동일한 이름의 클래스를 가져도 오류가 안난다.

        Student student1 = new Student();
        student1.studentName = "박건욱";
        System.out.println(student1.getStudentName());

        Student student2 = new Student();
        student2.studentName = "임도원";
        System.out.println(student2.getStudentName());
    }
}
