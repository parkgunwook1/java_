package school.ch1.together.homework.ch14_employee.view;

import school.ch1.together.homework.ch14_employee.controller.EmployeeController;

import java.util.Scanner;

public class EmployeeMenu {
    Scanner sc = new Scanner(System.in);

    EmployeeController ec = new EmployeeController();

    // 메인 메뉴를 출력하는 기본 생성자
    public EmployeeMenu() {
        System.out.println("1. 사원 추가");
        insertEmp();
        System.out.println("2. 사원 수정");
        updateEmp();
        System.out.println("3. 사원 삭제");
        deleteEmp();
        System.out.println("4. 사원 출력");
        printEmp();
        System.out.println("9. 프로그램 종료");
        char ch = sc.nextLine().charAt(0);
        System.out.print("메뉴 번호를 누르세요");

        if (ch == '1') {
            insertEmp();
        }else if(ch == '2'){
             updateEmp();
        }else if(ch == '3') {
            deleteEmp();
        }else if (ch == '4') {
            printEmp();
        }else if (ch == '9') {
            System.out.println("프로그램 종료합니다.");
        }else {
            System.out.println("잘못 입력했습니다.");
        }
    }

    // 저장할 데이터를 사용자에게 받는 메소드
    public void insertEmp() {
        // 사원 추가
        System.out.print(" 사원 번호 : ");
        int empNo = sc.nextInt();

        System.out.print(" 사원 이름 : ");
        String name = sc.nextLine();

        System.out.print(" 사원 성별 : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print(" 전화 번호");
        String phone = sc.nextLine();

        System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
        char ch = sc.nextLine().charAt(0);
        if (ch == 'y') {
            System.out.println("사원 부서 : ");
            System.out.println("사원 연봉 :");
            System.out.println("보너스 율 :");
        }else {
            return;
        }
    }
    // 수정할 데이터를 사용자에게 받는 메소드
    public void updateEmp() {
        // 사원 수정
        System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
        System.out.println("사원의 어떤 정보를 수정하시겠습니까?");

        System.out.println("1. 전화번호");
        System.out.println("2. 사원 연봉");
        System.out.println("3. 보너스 율");
        System.out.println("9. 돌아가기");
        System.out.println("메뉴 번호를 누르세요");
        char ch = sc.nextLine().charAt(0);
        if (ch == '1') {
            System.out.println("수정할 전화번호 : ");
        }else if(ch == '2') {
            System.out.println("수정할 사원 연봉 :");
        }else if (ch == '3') {
            System.out.println("수정할 보너스 율");
        }else if(ch == '9') {
            System.out.println("메인 메뉴로 돌아갑니다.");
        }else {
            System.out.println("잘못 입력 하셨습니다.");
        }
    }
    // 데이터 삭제하는 메소드
    public void deleteEmp() {
        // 사원 삭제

        System.out.println("정말 삭제하시겠습니까? (y/n)");
        char ch = sc.nextLine().charAt(0);
        if (ch == 'y' ) {
            System.out.println("데이터 삭제에 성공하였습니다.");
        }else {
            System.out.println("메인 메뉴로 돌아갑니다.");
        }

    }
    // 데이터 출력하는 메소드
    public void printEmp() {
        // 사원 출력
        System.out.println("사원 데이터가 없습니다.");
    }
}
