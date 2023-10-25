package school.ch1.together.study.ch20_collection.treeset_project.view;

import school.ch1.together.study.ch20_collection.treeset_project.controller.LotteryController;
import school.ch1.together.study.ch20_collection.treeset_project.mode.vo.Lottery;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {

    private Scanner sc = new Scanner(System.in);
    private LotteryController lc = new LotteryController();

    public void mainMenu() {
        while (true) {
            System.out.println("========== KH  추첨  프로그램  ==========");

            System.out.println("*******  메인  메뉴  *******");
            System.out.println("1.  추첨  대상  추가 :");
            System.out.println("2. 추첨 대상 확인");
            System.out.println("3. 당첨 대상 확인");
            System.out.println("4. 정렬된 당첨 대상 확인");
            System.out.println("5. 당첨 대상 검색");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    insertObject();
                    break;
                case 2:
                    deleteObject();
                    break;
                case 3:
                    winObject();
                    break;
                case 4:
                    sortedWinObject();
                    break;
                case 5:
                    searchWinner();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }

    }
    public void insertObject() {
        Set<Lottery> lotterySet = new HashSet<>(); // 추첨 대상을 저장할 Set 생성

        System.out.print("추가할 추첨 대상 수: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print("추첨자 이름: ");
            String name = sc.nextLine();

            System.out.print("추첨자 핸드폰 번호: ");
            String phone = sc.nextLine();

            Lottery lt = new Lottery(name, phone);

            boolean result = lc.insertObject(lt);
            if (!result) {
                System.out.println("중복된 대상입니다. 다시 입력하십쇼");
                i--;
            } else {
                System.out.println("추가 완료되었습니다.");
            }
//                lc.insertObject(lt);
//
//                if (!lotterySet.contains(lt)) {
//                    // Set에 대상이 중복되지 않으면 대상을 추가
//                    lotterySet.add(lt);
//                } else {
//                    System.out.println("중복된 대상입니다. 다시 입력하세요.");
//                    i--; // 중복되면 다시 대상을 입력할 수 있게 i를 감소
//                }
//            }
//            System.out.println("추가 완료되었습니다.");
        }
    }

    public void deleteObject() {
        System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요");

        System.out.print(" 이름 : ");
        String name = sc.nextLine();

        System.out.print("핸드폰 번호('-빼고')");
        String phone = sc.nextLine();

        Lottery lottery = new Lottery(name,phone);

        if (lc.deleteObject(lottery)) {
            System.out.println("삭제 완료 되었습니다.");
        } else {
            System.out.println("존재하지 않는 대상입니다.");
        }
    }
    public void winObject() {
        Set<Lottery> lotterySet = new HashSet<>();
        System.out.println(lotterySet);
    }
    public void sortedWinObject() {

    }
    public void searchWinner() {

    }
}
