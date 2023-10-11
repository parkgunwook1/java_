package school.ch1.together.study.ch8_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A_array {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        // 배열 반복문 이용하여 출력

        int arr[] = new int[11];

        // 1부터 10까지의 값을 배열에 저장
        for (int i = 1; i <= 10; i++) {
            arr[i] = i;
        }
        // 배열의 값을 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(arr[i]);
        }
    }

    public void method2() {
        //배열 반복문 이용하여 역순으로 출력
        int arr[] = new int[11];

        // 1부터 10까지의 값을 역순으로 저장
        for (int i = 1; i <= 10; i++) {
            arr[10 - i] = i;
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);
        }
    }

    public void method3() {
        System.out.println("양의 정수");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("양의 정수를 입력해야 합니다.");
            return;
        }
        int[] arr = new int[a]; // 입력받은 값만큼의 배열 크기 할당

        for (int i = 0; i < a; i++) {
            arr[i] = i + 1;
        }
        // 배열의 값 출력
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
    }

    // 랜덤값 발생시켜 배열에 초기화한 후 출력
    public void method4() {
        int[] arr = new int[11];
        Random random = new Random();

        for (int i = 1; i < arr.length; i++) {
            int randomNumber = random.nextInt(10) + 1;
            arr[i] = randomNumber;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void method5() {
        // 월 ~ 일 까지 초기화된 문자열 배열 만들고 0부터 6까지 숫자 입력받아
        // 입력한 숫자와 같은 인덱스에 있는 요일 출력하고 범위에 없는 숫자 입력시 잘못 입력 출력

        String[] arr = {"월", "화", "수", "목", "금", "토"};
        int day = 6;

        System.out.println("0부터 ~ 6까지 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        if (a >= 0 && a <= 6) {
            String days = arr[a];
            System.out.println(a + days);
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }

    public void method6() {

        /*
         * 복사본 배열만 가지고 수정 했는데 원본 배열도 수정이 된다.
         * 이유는 얕은복사가 이루어졌기 때문 => 배열의 주소값이 복사되어 원본과 복사본은 사실상 동일한 데이터를 공유하고 있다.
         *
         * */
        int[] origin = {1, 2, 3, 4, 5};
        System.out.println("==원본 배열 출력==");
        for (int i = 0; i < origin.length; i++) {
            System.out.println(origin[i] + " ");
        }

        // 얕은복사
        int[] copy = origin; // origin 배열에 저장된 주소값을 copy에 대입
        System.out.println("\n== 카피 배열 출력 ==");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");
        }
        copy[0] = 99;

        System.out.println("\n복사본 배열 변경후...");
        System.out.println("==원본 배열 출력==");
        for (int i = 0; i < origin.length; i++) {
            System.out.println(origin[i] + " ");
        }
        System.out.println("==원본 배열 출력==");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(origin[i] + " ");
        }
    }

    public void method7() {

        // for문을 사용한 깊은 복사
        // 값을 복사하기위한 새로운 배열을 선언 및 할당하고, 각 인덱스별 내부값을 일일이 대입하는 방법
        int[] origin = {1, 2, 3, 4, 5};
        int[] copy = new int[origin.length];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = origin[i];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
        copy[0] = 99;

        System.out.println("\n복사본 배열 변경후...");
        System.out.println("==원본 배열 출력==");
        for (int i = 0; i < origin.length; i++) {
            System.out.println(origin[i] + " ");
        }
        System.out.println("==원본 배열 출력==");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(origin[i] + " ");
        }
    }

    public void method8() {  // 배열 평균
        int[] grade = new int[]{90, 90, 90};
        int sum = 0;

        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / grade.length);
    }

    public void method9() {
        // 새로운 배열 생성한 후 System 클래스 내부의 arraycopy 메서드 사용
        int[] origin = {1, 2, 3, 4, 5};

        int[] copy = new int[10];

        // System.arraycopy(원본 배열, 원본배열의 복사를 시작할 인덱스, 복사할 배열, 복사본 배열의 시작 인덱스, 복사할 개수);
        System.arraycopy(origin, 0, copy, 0, 5);

        int originIndex = 0;
        for (int i = 3; i < 3 + 5; i++) {
            copy[i] = origin[originIndex++];
        }
    }

    public void method10() {

        int[][] arr = new int[2][3];

        int k = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void method11() {
        // Arrays클래스에서 제공하는 copyof 메서드 사용
        int[] origin = {1, 2, 3, 4, 5};

        // 복사한 배열 = Arrays.copyof(원본배열명, 복사할 갯수)
        int[] copy = Arrays.copyOf(origin, 3);

//        int[] copy2 = new int[3];
//        for (int i = 0; i < 3; i ++) {
//
//        }
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");

            /*
             * 2. System.arraycopy() : 몇변 인덱스부터 몇개를 복사본 배열의 어느 위치에 복사할건지 세밀하게 설정 가능함.
             * 3. Arrays.copyof() : 무조건 원본배열의 0번 인덱스부터 내가 제시한 갯수만큼 복사가 진행됨. 내가 제시한 길이가 원본배열보다 크다면 0으로 채워줌
             *
             * */
        }
    }

    public void method12() {
        // clone 메소드 사용
        int[] origin = {1, 2, 3, 4, 5};

        int[] copy = origin.clone(); // 무조건 원본 배열과 동일한 값 반환
    }

    public void method13() {
        int[][] arr = new int[3][5];

        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void method14() {
        int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t"); // \t == tab
            }
            System.out.println();
        }
    }

    public void method15() {
        /*
         * 가변 배열
         * 행의 크기는 변경이 불가능하나, 행별로 열의 갯수를 내 마음대로 지정할 수 있다.
         * 이차원 배열 == 일차원 배열을 여러개 묶은형태
         *
         * 즉, 2차원 배열 선언할 때 행 크기 지정후, 열의 크기는 생략 가능하다.
         * */
        int value = 1;
        int[][] arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]); // 열의 길이를 지정 안해줘서 null
        System.out.println(arr.length); // 에러

        arr[0] = new int[2];
        arr[1] = new int[]{5, 6, 8};
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void method16() {
        // char[][] 가변 배열 생성
        char[][] arr = new char[3][];

        arr[0] = new char[3]; // {'a','b','c'};
        arr[1] = new char[2]; // {'d','e'};
        arr[2] = new char[6]; // {'f','g','h','j','i','k'};

        int count = 97;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += count;
                System.out.print(arr[i][j] + " ");
                count++;
            }
            System.out.println();
        }
    }

    public void method17() {
        int[][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0) {
                    System.out.print("국어점수 : ");
                    int a = sc.nextInt();
                    arr[i][j] = a;
                } else {
                    System.out.print("영어점수 : ");
                    int b = sc.nextInt();
                    arr[i][j] = b;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
    public void method18() {

        // 월 ~ 일 까지 초기화된 문자열 배열 만들기
        String[] day = new String[]{"월", "화", "수", "목", "금", "토", "일"};

        // 0부터 6까지 숫자를 입력받고 입력한 숫자와 같은 인덱스에 있는 요일 출력
        System.out.println("0 ~ 6 사이 숫자 입력 : ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 6) {
            System.out.println(day[num]);
        } else
            System.out.println("잘못 입력했습니다.");
    }
    public void method19() {
        // 1. 사용자가 배열의 길이 직접 입력하여 그 값만큼 배열 선언 및 할당
        System.out.print("정수 : ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        // 2. 배열 크기만큼 사용자가 값을 직접 입력하여 안덱스에 값을 초기화
        for (int i = 0; i < arr.length; i++) {

            System.out.print("배열 "+ i + "번째 인덱스에 넣을 값 : ");
            int x = sc.nextInt();
            arr[i] += x;
        }
        // 3. 배열 전체 값 나열하고 인덱스에 저장된 값들의 합 출력.
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void method20() {
        // 문자열을 입력받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
        System.out.println("문자열 : ");
        String a = sc.nextLine();


    }

}
