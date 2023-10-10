package school.ch1.together.study.array;

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

       String[] arr = {"월","화","수","목","금","토"};
       int day = 6;

       System.out.println("0부터 ~ 6까지 숫자를 입력하세요 : ");
       int a = sc.nextInt();
   }
}