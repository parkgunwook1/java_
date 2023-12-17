package school.ch1.together.homework.ch16_extends_report.model;

public class Student extends Person{
    private int grade;
    private String major;

    public Student() {

    }
    public Student(String name,int age, double height, double weight, int grade, String major) {

    }
    public String toString() {
        return "";
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
