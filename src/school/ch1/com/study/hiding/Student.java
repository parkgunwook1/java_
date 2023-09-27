package school.ch1.com.study.hiding;

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
