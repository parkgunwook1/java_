package school.alone.ch_1.static_var;

public class StudentTest1 {
    public static void main(String[] args) {
        // static 변수는 인스턴스를 생성할 때마다 만들어지는 것이 아니고 클래스를 선언할 때 특정 메모리에 저장되어 모든 인스턴스가 공유하는 변수이다.
        // 인스턴스보다 먼저 생성하므로 클래스 이름으로도 참조하여 사용할 수 있다.
        // static 변수, 정적 변수, 클래스 변수 = static 변수

        Student1 studentLee = new Student1();
        studentLee.setStudentName("임도원");
        System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);

        Student1 studentPark = new Student1();
        studentPark.setStudentName("박건욱");
        System.out.println(studentPark.studentName + "학번 : " + studentPark.studentID);
    }
}
