package school.ch1.together.study.ch20_collection.hashmap_project.view;

import school.ch1.together.study.ch20_collection.hashmap_project.controller.MemberController;
import school.ch1.together.study.ch20_collection.hashmap_project.model.vo.Member;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MemberMenu {
    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public void mainMenu() {
        while (true) {
            System.out.println("========== kh 사이트 ==========");

            System.out.println("******* 메인 메뉴 *******");

            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9 종료");
            System.out.print("메뉴 번호 선택 : ");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    joinMembership();
                    break;
                case 2:
                    login();
                    memberMenu();
                    break;
                case 3:
                    sameName();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }
    public void memberMenu() {
        while (true) {
            System.out.println("****** 회원 메뉴 ********");

            System.out.println("1. 비밀번호 바꾸기");
            System.out.println("2. 이름 바꾸기");
            System.out.println("3. 로그아웃");
            System.out.print("메뉴 번호 선택 : ");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    changeName();
                    break;
                case 3:
                    System.out.println("로그아웃 되었습니다.");
                    mainMenu();
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }
    public void joinMembership() {
        System.out.print("아이디 입력해주세요 :" );
        String id = sc.nextLine();

        System.out.print("이름 입력해주세요 :");
        String name = sc.nextLine();

        System.out.println("비밀번호 입력해주세요 :");
        String password = sc.nextLine();

        Member member = new Member(name,password);

        boolean su = mc.joinMembership(id,member);

        if (su) {
            System.out.println("성공적으로 회원가입 완료했습니다.");
        }else {
            System.out.println("중복된 아이디입니다.");
            joinMembership();
        }
    }
    public void login() {
        while (true) {
            System.out.print("아이디 : ");
            String id = sc.nextLine();

            System.out.print("비밀번호 : ");
            String password = sc.nextLine();

            String name = mc.login(id, password);

            if (name == null) {
                System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
                continue;
            }
                System.out.println(name + "님 환영합니다.");
                break;
        }
    }
    public void changePassword() {
        System.out.print("아이디 : ");
        String id = sc.nextLine();

        System.out.print("비민번호 : ");
        String oldpw = sc.nextLine();

        System.out.println("변경할 비밀번호 : ");
        String newpw = sc.nextLine();

        boolean result = mc.changePassword(id,oldpw,newpw);
        if (result) {
            System.out.println("비밀번호 변경이 성공했습니다.");
        }else {
            System.out.println("비밀번호 변경이 실패했습니다. 다시 입력해주세요.");
            changePassword();
        }

    }
    public void changeName() {
        Member member = new Member();

        while (true) {
            System.out.print("아이디 입력 : ");
            String id = sc.nextLine();

            System.out.print("비밀번호 입력 : ");
            String password = sc.nextLine();

            String name = mc.login(id, password);
            if (name == null) {
                System.out.println("이름 변경 실패했습니다. 다시 입력해주세여");
                continue;
            }
            System.out.println("현재 설정된 이름 : " + name);
            System.out.print("변경할 이름 : ");
            String newName = sc.nextLine();

            // 반환값이 void 이면 boolean 으로 못넣어준다.
            mc.changeName(id, newName);
            System.out.println("이름 변경 성공했습니다.");
        }
    }
    public void sameName() {
        // 검색할  이름을  받고  mc의  sameName()메소드로  넘김.
        //  반환  값을  가지고  entrySet()을  이용하여  ‘이름-아이디’ 형식으로  출력
        System.out.print("검색할 이름 : ");
        String name = sc.nextLine();

        Set<Map.Entry<String,String>> s = mc.sameName(name).entrySet();
        for ( Map.Entry<String, String> e : s) {
            System.out.println(e.getValue() + "-" + e.getKey());
        }
    }
}
