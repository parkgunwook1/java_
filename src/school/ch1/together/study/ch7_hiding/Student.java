package school.ch1.together.study.ch7_hiding;

public class Student {

    int studentID;
    private String studentName;
    int grade;
    String address;

    public String getStudentName() { //get
        return studentName;
    }
    public void setStudentName(String studentName) { //set
        this.studentName = studentName;
    }
}
