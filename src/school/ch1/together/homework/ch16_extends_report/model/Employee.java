package school.ch1.together.homework.ch16_extends_report.model;

public class Employee {
    private int salary;
    private String dept;

    public Employee() {

    }
    public Employee(String name, int age, double height, double weight, int salary, String dept) {

    }
    public String toString() {
        return "";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
