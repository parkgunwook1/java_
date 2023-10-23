package school.ch1.together.study.ch19_io.file.run.ch07_pratice2.view;

import school.ch1.together.study.ch19_io.file.run.ch07_pratice2.score.controller.ScoreController;

import java.io.*;
import java.util.Scanner;

public class ScoreMenu {
    private Scanner sc = new Scanner(System.in);

    private ScoreController scr = new ScoreController();

    public void mainMenu() {

        while (true) {
            System.out.println(" 1. 성적 저장");
            System.out.println(" 2. 성적 출력 ");
            System.out.println(" 9. 끝내기");
            System.out.print("메뉴번호 : ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    saveScore();
                    break;
                case 2:
                    readScore();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력했습니다. 다시 입력해주세요");
            }
        }
    }
    public void saveScore() {
        int num = 0;
        while (true) {
        System.out.println((++num) + "번 째 학생 정보 기록");

        System.out.print(" 이름 : " );
        String name = sc.nextLine();

        System.out.println("국어 점수 : ");
        int kor = sc.nextInt();

        System.out.println("영어 점수 : ");
        int eng = sc.nextInt();

        System.out.println("수학 점수 : ");
        int math = sc.nextInt();

        int sum = kor + eng + math;
        double avg = sum / 3.0;


        scr.saveScore(name,kor,eng,math, sum, avg);

        System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
        char ch = sc.nextLine().toLowerCase().charAt(0);
        if (ch == 'n') {
            break;
        }
     }
}
    public void readScore() {

        File file = new File("student.txt");

        int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
        int sumAll = 0; // 총합
        double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수

        // scr의 readScore() 반환 값을 DataInputStream에 담고 반복문을 이용하여
        // 안에 들어가있는 데이터를 가지고 와서 출력
       try {
           DataInputStream dis = new DataInputStream(new FileInputStream(file));
           ScoreMenu sc = new ScoreMenu();
           while (true) {
               // 모든 파일이 읽어졌을때 나오는 EOFException을 이용하여
               // EOFException가 일어났을 때 읽은 횟수, 전체 합계, 전체 평균 출력
               String name = dis.readUTF();
               int kor = dis.readInt();
               int eng = dis.readInt();
               int math = dis.readInt();
               int sum = dis.readInt();
               double avg = dis.readDouble();

               System.out.println("\t 이름   " + name + "\t 국어 " + kor + "\t영어" + eng + "\t수학" + math + "\t총점" + sum + "\t 평균 " + avg);
               System.out.println("");
               System.out.println();
               count++;
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }catch (EOFException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
