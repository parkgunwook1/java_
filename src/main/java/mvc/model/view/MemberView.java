package mvc.model.view;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

import java.util.List;

public class MemberView {
    private java.util.Scanner sc = new java.util.Scanner(System.in);

    private MemberController mc = new MemberController();


    /**
     * 사용자가 보게될 화면(메인화면)
     */
    public void mainMenu() {
        while (true) {
            System.out.println("***** 회원관리 프로그램 *****");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 회원 아이디로 검색");
            System.out.println("4. 회원 이름 키워드 검색");
            System.out.println("5. 회원 정보 변경");
            System.out.println("6. 회원 탈퇴");
            System.out.println("0. 프로그램 종료");
            System.out.print("이용할 메뉴 선택: ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1: insertMember(); break;
                case 2: selectAll(); break;
                case 3: selectByUserId(); break;
                case 4:	selectByUserName(); break;
                case 5:	updateMember(); break;
                case 6:	deleteMember();	break;
                case 0: System.out.println("프로그램을 종료합니다"); return;
                default: System.out.println("잘못 선택했습니다"); break;
            }
        }
    }

    private void deleteMember() {
        System.out.println("----- 회원 탈퇴 -----");
        System.out.print("탈퇴할 회원의 ID : ");
        String userId = sc.nextLine();

        mc.deleteMember(userId);
    }

    /**
     * 사용자에게 변경할 회원의 아이디, 변경할 정보들을 입력받은 후 변경 요청하는 메소드
     */
    private void updateMember() {
        System.out.println("----- 회원정보 변경 -----");
//		변경할 회원의 아이디
        System.out.print("변경할 회원의 아이디 : ");
        String userId = sc.nextLine();

//		변경할 정보들
        System.out.print("변경할 비밀번호 : ");
        int newPwd = Integer.parseInt(sc.nextLine());
        System.out.print("변경할 이메일 : ");
        String newEmail = sc.nextLine();
        System.out.print("변경할 휴대폰 번호(숫자만) : ");
        String newPhone= sc.nextLine();
        System.out.print("변경할 주소 : ");
        String newAddress = sc.nextLine();

        mc.updateMember(userId, newPwd, newEmail, newPhone, newAddress);
    }

    private void selectByUserName() {
        System.out.println("----- 회원 이름 키워드 검색 -----");
        System.out.print("회원 이름 키워드 입력 : ");
        String keyword = sc.nextLine();

        mc.selectByUserName(keyword);
    }

    /**
     * 사용자의 아이디로 검색 요청을 처리해주는 메소드
     */
    private void selectByUserId() {
        System.out.println("----- 회원 아이디로 검색 -----");
        System.out.print("검색할 회원의 아이디 : ");
        String userId = sc.nextLine();

        mc.selectByUserId(userId);
    }

    /**
     * 회원 전체 조회 메서드
     */
    private void selectAll() {
        System.out.println("----- 회원 전체 조회 -----");

//		회원 전체 조회
        mc.selectAll();
    }

//	----------------------------------------------------------------------------------------------------
//	서비스 요청 처리 후 사용자가 보게될 응답화면들

    public void displayData(List<Member> list) {
        System.out.println("\n조회된 데이터는 " + list.size() + "건 입니다\n");
        for (Member m : list) {
            System.out.println(m);
        }
    }

    public void displayNodata(String message) {
        System.out.println(message);
    }
    /**
     * 회원 추가용 화면
     * 추가하고자 하는 회원의 정보를 입력받아서 회원 추가 요청할 수 있는 화면
     */
    private void insertMember() {
        System.out.println("----- 회원 추가 -----");

//		입력
        System.out.print("아이디 : ");
        String userId = sc.nextLine();

        System.out.print("비밀번호 : ");
        int userPwd = Integer.parseInt(sc.nextLine());

        System.out.print("이름 : ");
        String userName = sc.nextLine();

        System.out.print("성별(M/F) : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("이메일 : ");
        String email = sc.nextLine();

        System.out.print("핸드폰번호 : ");
        String phone = sc.nextLine();

        System.out.print("주소 : ");
        String address = sc.nextLine();

        System.out.print("취미(,로 공백없이 나열) : ");
        String hobby = sc.nextLine();

//		입력받은 정보를 가지고 회원추가 요청보내기
        mc.insertMember(userId, userPwd, userName, gender, age, email, phone, address, hobby);
    }

    public void displayOne(Member m) {
        System.out.println("\n조회된 데이터는 다음과 같습니다");
        System.out.println(m);
    }
}
