package school.ch1.together.study.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        // 내부에서 사용할 변수나 메서드는 private 로 선언해서 외부에서 접근하지 못하도록 하는 것을 객체 지향에서는 정보 은닉 이라고 한다.
        /* student.studentName = "박건욱"; */  // studentName 을 private 접근 제한자로 생성해서 오류가 난다.
        // private 으로 선언한 studentName에 접근 하려면 getter, setter 메서드를 사용해야 한다.

        student.setStudentName("박건욱");   // setStudent() 메서드를 활용해 private 변수에 접근 가능. 외부 클래스에서 직접 접근할 수는 없지만, public 메서드 통해 private 변수에 접근할 수 있다.
        System.out.println(student.getStudentName());

    }
}
