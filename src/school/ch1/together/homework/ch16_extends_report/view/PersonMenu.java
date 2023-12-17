package school.ch1.together.homework.ch16_extends_report.view;

//public class PersonMenu {
//    Scanner sc = new Scanner(System.in);
//    PersonController pc = new PersonController();
//
//    public void mainMenu() {
//        System.out.println("학생은 최대 3명가지 저장할 수 있습니다.");
//        System.out.println("현재 저장된 학생은 M명 입니다.");
//        System.out.println("사원은 최대 10명 까지 저장할 수 있습니다.");
//        System.out.println("현재 저장된 사원 N입니다.");
//        // m과 n에 들어가는 숫자는 personController pc 클래스에 있는
//        // personCount 메소드의 반환 값을 이용하여 출력
//
//        System.out.println("1. 학생 메뉴");
//        System.out.println("2. 사원 메뉴");
//        System.out.println("9. 끝내기");
//        System.out.println("메뉴 번호 :");
//
//        int num = sc.nextInt();
//        switch (num) {
//            case 1: studentMenu(); break;
//            case 2: employeeMenu(); break;
//            case 9:
//                System.out.println("종료합니다.");
//                return;
//            default :
//                System.out.println("잘못 입력했습니다.");
//        }
//    }
//
//    public void studentMenu() {
//        System.out.println("1. 학생 추가");
//        System.out.println("2. 학생 보기");
//        System.out.println("9. 메인으로");
//        System.out.println("메뉴 번호 :");
//
//        int num = sc.nextInt();
//        switch (num) {
//            case 1:
//                insertStudent();
//                break;
//            case 2:
//                printStudent();
//                break;
//            case 9:
//                System.out.println("메인으로 돌아갑니다.");
//                return;
//            default:
//                System.out.println("잘못 입력했습니다.");
//        }
//    }
//    public void employeeMenu() {
//        System.out.println("1. 학생 추가");
//        System.out.println("2. 학생 보기");
//        System.out.println("9. 메인으로");
//        System.out.println("메뉴 번호 :");
//
//        int num = sc.nextInt();
//        switch (num) {
//            case 1:
//                insertEmployee();
//                break;
//            case 2:
//                printEmployee();
//                break;
//            case 9:
//                System.out.println("메인으로 돌아갑니다.");
//                return;
//            default:
//                System.out.println("잘못 입력했습니다.");
//        }
//    }
//    public void insertStudent() {
//        System.out.println("학생이름 :");
//        String name = sc.nextLine();
//
//        System.out.println("학생 나이: ");
//        int age = sc.nextInt();
//
//        System.out.println("학생 키: ");
//        double height = sc.nextDouble();
//
//        System.out.println("학생 몸무게 : ");
//        double weight = sc.nextDouble();
//
//        System.out.println("학생 학년 : ");
//        int grade = sc.nextInt();
//
//        System.out.println("학생 전공 : ");
//        String major = sc.nextLine();
//
//        // 작성중
//
//    }
//
//    public void printStudent() {
//        System.out.println(pc.printStudent());
//    }
//
//    public void insertEmployee() {
//        System.out.println("사원 이름 :");
//        String name = sc.nextLine();
//
//        System.out.println("사원 나이: ");
//        int age = sc.nextInt();
//
//        System.out.println("사원 키: ");
//        double height = sc.nextDouble();
//
//        System.out.println("사원 몸무게 : ");
//        double weight = sc.nextDouble();
//
//        System.out.println("사원 급여 : ");
//        int salary = sc.nextInt();
//
//        System.out.println("사원 부서 : ");
//        String dept = sc.nextLine();
//    }
//
//    public void printEmployee() {
//        System.out.println(pc.printEmployee());
//
//    }
