package school.alone.ch_1.exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            for (int i = 0; i <= 5; i++) {  // 예외가 발생할 수 있으므로 try 블록에 작성
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);         // 예외가 발생하면 catch 블록 수행
            System.out.println("예외 처리 부분");
        }
        System.out.println("프로그램 종료"); // 프로그램이 비정상 종료되었다면 문장을 실행할 수 없다.
    }
}
