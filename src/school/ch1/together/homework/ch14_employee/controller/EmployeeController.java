package school.ch1.together.homework.ch14_employee.controller;

import school.ch1.together.homework.ch14_employee.model.vo.Employee;

public class EmployeeController {
    private Employee e = new Employee();

    // 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
    public void add(int empNo, String name, char gender, String phone) {
        e.setEmpNo(empNo);
        e.setName(name);
        e.setGender(gender);
        e.setPhone(phone);
    }

    // 매개변수 있는 생성자 이용하여 데이터 저장하는 메소드
    public void  add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {

          e.setEmpNo(empNo);
          e.setName(name);
          e.setGender(gender);
          e.setPhone(phone);
          e.setDept(dept);
          e.setSalary(salary);
          e.setBonus(bonus);
    }

    // setter로 정보 수정
    public void modify(String phone){
        e.setPhone("");
    }
    // setter로 정보 수정
    public void modify(int salary) {

    }
    // setter로 정보 수정
    public void modify(double bonus) {

    }
    // 객체 삭제하는 메소드
    public Employee remove () {

    }
    // 객체 저장된 데이터 가져와 반환하는 메소드
    public String inform() {

    }
}
