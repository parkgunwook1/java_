package school.ch1.together.homework.ch14_employee.model.vo;

public class Employee {
    private int empNo;
    private String name; //이름
    private char gender; //성별
    private String phone; //전화번호
    private String dept;
    private int salary; // 월급
    private double bonus; //보너스

    // 기본 생성자
    public Employee() {}

    // 4개의 초기 값을 받는 생성자
    public Employee(int empNo, String name, char gender, String phone) {
        this.empNo = empNo;
        this.name = name;
        this.gender = gender;
        this.phone = phone;

    }

    // 7개의 초기 값을 받는 생성자
    public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
        this.empNo = empNo;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.dept = dept;
        this.salary = salary;
        this.bonus = bonus;

    }

    // 직원 정보 반환
    public String printEmployee() {
        return
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
