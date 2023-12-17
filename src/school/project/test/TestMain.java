package school.project.test;

import school.project.school.School;
import school.project.school.Score;
import school.project.school.Student;
import school.project.school.Subject;
import school.project.school.report.GenerateGradeReport;
import school.project.utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }
    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학" , Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    public void createStudent() {
        Student student1 = new Student(10000,"박건욱",korean);
        Student student2 = new Student(10001,"임도원",math);
        Student student3 = new Student(10002,"정윤성",korean);
        Student student4 = new Student(10003,"구진영",math);
        Student student5 = new Student(10004,"김종하",korean);

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 55);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 55);

        addScoreForStudent(student3, korean, 75);
        addScoreForStudent(student3, math, 55);

        addScoreForStudent(student4, korean, 100);
        addScoreForStudent(student4, math, 75);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 45);

    }
    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
