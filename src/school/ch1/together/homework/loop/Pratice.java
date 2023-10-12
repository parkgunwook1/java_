package school.ch1.together.homework.loop;

import java.util.Random;
import java.util.Scanner;

public class Pratice {
    Scanner sc = new Scanner(System.in);

    public void pratice1() {
        System.out.println("정수 : ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("양수가 아닙니다.");
            return;
        }
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.print("박");
            } else {
                System.out.print("수");
            }
        }
    }

    public void pratice2() {
        System.out.println("정수 : ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("양수가 아닙니다.");
        }
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 1) {
                    System.out.println("박");
                } else {
                    System.out.println("수");
                }
            }
        }
    public void pratice3() {
        System.out.println("문자열 : ");
        String a = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요: ");
        char searchChar = sc.next().charAt(0);

        int count = countOccurrences(a, searchChar);
        System.out.println("문자 '" + searchChar + "'는 문자열에서 " + count + "번 등장합니다.");
        /*while(true) {
            System.out.println("더 하시겠습니까? (y,n) :" );
            char ch2 = sc.nextLine().charAt(0);

            if (ch2 == 'Y' || ch2 == 'y') {
                pratice3;
                break;
            }else if (ch2 == 'N' || ch2 == 'n') {
                break;
            }else {
                System.out.println("잘못 입력했움");*/
    }

    // 문자열에서 특정 문자의 등장 횟수를 세는 함수
    public static int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    public void pratice4() {
        Random ra = new Random();

        // int random = (int)(Math.random() *100 + 1);
        int answer = ra.nextInt(100) + 1; // 1부터 100 사이의 난수 생성
        int attempts = 0;

        while (true) {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("1부터 100 사이의 숫자를 입력해주세요.");
                continue;
            } else if (guess < answer) {
                System.out.println("up");
            } else if (guess > answer) {
                System.out.println("down"); // up down을 하면 == 를 사용안해도 찾게 된다.
            } else {
                System.out.println("정답입니다. " + attempts + "회만에 맞추셨습니다.");
                break;
            }
        }
    }
    public void pratice5() {
        // 1. 사용자의 이름 입력 받기
        System.out.print("당신의 이름을 입력하세요.");
        String name = sc.nextLine();
        int wine = 0;
        int lose = 0;
        int draw = 0;

        // 2. 컴퓨터와 가위바위보 하는데 가위인지 보인지 주먹인지 랜덤한 수를 통해 결정
        Random ra = new Random();
        String game =  ra.toString();

        // 3. 사용자에게 직접 가위바위보 받기
        while (true) {
            System.out.println("가위바위보 : ");
            String rps = sc.nextLine();
            int com = (int) (Math.random() * 3 + 1);

            switch (rps) {
                case "가위":
                    if (com == 1) {
                        draw++;
                    }else if(com == 2) {
                        lose++;
                    }else {
                        wine++;
                    }
                    break;
                case "바위":
                    if (com == 1) {
                        wine++;
                    }else if(com == 2) {
                        draw++;
                    }else {
                        lose++;
                    }
                    break;
                case"보":
                    if (com == 1) {
                        lose++;
                    }else if(com == 2) {
                        wine++;
                    }else {
                        draw++;
                    }
                    break;
                case"exit":
                    System.out.printf("%d전 %d승 %무 %패",(wine+lose+draw),wine,draw,lose);
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }

        }

        // 4. 사용자가 exit 입력하기 전까지 가위바위보 계속 진행
        // 5. exit 들어가면 반복을 멈추고 몇 번의 승부에서 몇 번 이기고 몇번비기고 몇번 졌는지 출력

        // 가위바위보를 어떻게 비교할 것인지.. (문자열 vs 문자열)? == draw는 가능 || win, lose 는 어떻게..?
        // 랜덤 안에 가위, 바위, 보를 어떻게 넣지?

    }
    public void pratice6() {
        Random rand = new Random();

        System.out.print("사용자 이름을 입력하세요: ");
        String userName = sc.nextLine();

        int userWins = 0; // 사용자가 이긴 횟수
        int computerWins = 0; // 컴퓨터가 이긴 횟수
        int ties = 0; // 무승부 횟수
        int gamesPlayed = 0; // 총 게임 횟수

        while (true) {
            System.out.print("가위, 바위, 보 중 하나를 입력하세요 (또는 'exit'를 입력하여 종료): ");
            String userChoice = sc.nextLine().toLowerCase(); // toLowerCase 는 String 클래스 메서드중 하나이다. 소문자로 변환

            if (userChoice.equals("exit")) {
                break;
            }

            int computerChoice = rand.nextInt(3); // 0: 가위, 1: 바위, 2: 보

            String[] choices = {"가위", "바위", "보"};
            System.out.println("컴퓨터: " + choices[computerChoice]);

            if (userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보")) {
                int userIndex = -1;
                for (int i = 0; i < choices.length; i++) {
                    if (userChoice.equals(choices[i])) {
                        userIndex = i;
                        break;
                    }
                }

                if (userIndex == computerChoice) {
                    System.out.println("비겼습니다!");
                    ties++;
                } else if ((userIndex == 0 && computerChoice == 2) ||
                        (userIndex == 1 && computerChoice == 0) ||
                        (userIndex == 2 && computerChoice == 1)) {
                    System.out.println(userName + "이(가) 이겼습니다!");
                    userWins++;
                } else {
                    System.out.println("컴퓨터가 이겼습니다!");
                    computerWins++;
                }
                gamesPlayed++;
            } else {
                System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
            }
        }

        System.out.println("게임 종료");
        System.out.println("게임 횟수: " + gamesPlayed);
        System.out.println(userName + "의 승리 횟수: " + userWins);
        System.out.println("컴퓨터의 승리 횟수: " + computerWins);
        System.out.println("무승부 횟수: " + ties);
    }

}

