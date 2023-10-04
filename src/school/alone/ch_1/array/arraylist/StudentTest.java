package school.alone.ch_1.array.arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Student studentPark = new Student(1001,"park");
        studentPark.addSubject("국억",100);
        studentPark.addSubject("수학",50);

        Student studentKim = new Student(1002,"kim");
        studentKim.addSubject("국어",70);
        studentKim.addSubject("수학",75);
        studentKim.addSubject("영어",100);

        studentPark.showStudentInfo();
        System.out.println("-------------------");
        studentKim.showStudentInfo();
    }
}
