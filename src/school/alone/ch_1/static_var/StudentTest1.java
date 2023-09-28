package school.alone.ch_1.static_var;

public class StudentTest1 {

    public static void main(String[] args) {
        
        // static 으로 선언한 serialNum 변수는 모든 인스턴스가 공유한다. 즉 두 개의 참조 변수가 동일한 변수의 메모리를 가리키고 있다.
        // 각각 다른 힙 메모리에 인스턴스 생성 > 스택 메모리 > 같은 데이터 영역 serialNum 참조

        Student studentPark = new Student();
        studentPark.setStudentName("박건욱");
        System.out.println(studentPark.serialNum);
        studentPark.serialNum++;


        Student studentLee = new Student();
        studentLee.setStudentName("임도원");
        System.out.println(studentLee.serialNum);
        System.out.println(studentPark.serialNum);
        studentLee.serialNum++;


    }
}
