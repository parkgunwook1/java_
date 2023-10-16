package school.ch1.together.homework.ch14_employee.controller;

import school.ch1.together.homework.ch14_employee.model.vo.Employee;

public class EmployeeController {
    private Employee e = new Employee();

    // 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
    public void add(int empNo, String name, char gender, String phone) {
        e = new Employee(empNo,name,gender,phone);

    }

    // 매개변수 있는 생성자 이용하여 데이터 저장하는 메소드
    public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
        e = new Employee(empNo,name,gender,phone,dept,salary,bonus);

    }

    // setter로 정보 수정
    public void modify(String phone) {
        e.setPhone(phone);
    }

    // setter로 정보 수정
    public void modify(int salary) {
        e.setSalary(salary);
    }

    // setter로 정보 수정
    public void modify(double bonus) {
        e.setBonus(bonus);
    }

    // 객체 삭제하는 메소드
    public Employee remove () {
        // 객체를 삭제하는 메소드 -> 객체 e에 null값을 저장해서 객체 삭제
        e = null;
        return e;
    }
    // 객체 저장된 데이터 가져와 반환하는 메소드
    public String inform() {
        return e == null ? "null" : e.printEmployee(); // 모든 참조 자료형은 null 값을 가질 수 있다.
    }
}
