//package school.ch1.together.study.ch19_io.file.run.pratice.view;
//
//import school.ch1.together.study.ch19_io.file.run.pratice.controller.FileController;
//
//import java.util.Scanner;
//
//public class FileMenu {
//
//    private Scanner sc = new Scanner(System.in);
//    private FileController fc = new FileController();
//
//    public void mainMenu() {
//        while (true) {
//            System.out.println("***** My Note *****");
//
//            System.out.println("1. 노트 새로 만들기");
//            System.out.println("2. 노트 열기");
//            System.out.println("3. 노트 열어서 수정하기");
//            System.out.println("9. 끝내기");
//            System.out.println("메뉴 번호 : ");
//
//            int num = Integer.parseInt(sc.nextLine());
//
//            switch (num) {
//                case 1: fileSave(); break;
//                case 2: fileOpen(); break;
//                case 3: fileEdit(); break;
//                case 9:
//                    System.out.println("프로그램 종료합니다.");
//                    break;
//                default:
//                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
////                    return; -> 출력문 마지막이니깐 알아서 위로 올라간다.
//            }
//        }
//    }
//    // String은 변경 불가능한 문자열을 생성한다.
//    // StringBuilder 는 변경 가능한 문자열을 만들어준다. 그러기 때문에 String을 합치는 작업 시 하나의 대안이된다.
//    public void fileSave() {
//        // 파일에 저장할 내용을 입력받는 부분
//        StringBuilder sb = new StringBuilder(); // 데이터 유지 위해 while 위에 전역변수로 설정.
//        String inputLine;
//
//        // ex끝it 입력할 때까지 사용자가 입력하게 하고, StringBuilder (content) 변수에 저장
//        while (true) {
//            System.out.println("파일에 저장할 내용을 입력하세요.");
//            System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
//            System.out.println("내용 : ");
//            inputLine = sc.nextLine();
//            if (inputLine.equals("ex끝it")) {
//                break;
//            }// ex끝it 외 다른 것을 적을시 StringBuilder(content) 에 inputLine 을 추가한다.
//            sb.append(inputLine).append("\n");
//        }
//
//        // 저장할 파일명을 입력받는 부분
//        while (true) {
//            System.out.println("저장할 파일명을 입력해주세요 (예: myFile.txt):");
//            String fileName = sc.nextLine();
//
//            if(fc.checkName(fileName)) {
//                System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
//                char ch = sc.nextLine().toLowerCase().charAt(0);
//
//                if (ch == 'y') {
//                    fc.fileSave(fileName, sb);
//                    break;
//                }
//           }else {
//                fc.fileSave(fileName, sb);
//                break;
//            }
////           String fileName = sc.nextLine();
////
////            // 파일명이 이미 존재하는지 확인
////            File file = new File(fileName);
////            if (file.exists()) {  // exists 메서드는 파일 또는 디렉토리가 현재 파일 시스템에 존재하는지 여부 확인하는데 사용
////                System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
////                String choice = sc.nextLine();
////
////                if ("y".equalsIgnoreCase(choice)) { // equalsIgnoreCase <- 대소문자 구분 없이 체크해줌
////                    // 파일을 덮어쓰도록 선택한 경우
////                    // FileController(fc)에 fileSave() 메서드로 파일명과 StringBuilder 전달
////                    fc.fileSave(fileName, new StringBuilder(content.toString()));
////                    // toString()을 사용하지 않고 결합하면 StringBuilder 객체 자체가 추가된다.
////                    break;
////                } else if ("n".equalsIgnoreCase(choice)) {
////                    // 파일명을 다시 입력받도록 반복
////                }
////            } else {
////                // 파일명이 존재하지 않는 경우
////                // 파일명과 내용을 fc에 fileSave 메서드로 전달
////                fc.fileSave(fileName, new StringBuilder(content.toString()));
////                break;
////            }
//        }
//    }
//
//    public void fileOpen() {
//        /*
//        public void fileOpen(){
//        열  파일  명  :
//        받은  파일  명을  fc에  checkName()의  매개변수로  넘겨  반환  값에  따라  나뉨
//        반환  값이  true일  경우  fc의  fileOpen()  메소드의  매개변수로  넘겨  반환  값  출력
//        반환  값이  false일  경우  “없는  파일입니다.” 출력  후  mainMenu()로  돌아감
//        * */
//        while (true) {
//            System.out.println(" 열 파일 명 :");
//            String file = sc.nextLine();
////            fc.checkName(file);
//            if (file.equals(fc.checkName(file))) {
//                fc.fileOpen(file);
//            } else {
//                System.out.println("없는 파일입니다.");
//                mainMenu();
//            }
//        }
//    }
//
//    public void fileEdit() {
//
//    }
//}
