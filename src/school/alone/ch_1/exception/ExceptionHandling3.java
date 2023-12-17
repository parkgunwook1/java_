package school.alone.ch_1.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        FileInputStream fls = null;

        try {
            fls = new FileInputStream("a.txt");
        }catch (FileNotFoundException e) {
            System.out.println(e);
            return;                 // 강제로 return 을 해도 finally 가 수행된 것을 확인할 수 있따.
        }finally {               // try 블록에서 네트워크나 데이터베이스에 연결한 경우에도 이 연결을 닫는 close 코드를 finally 블록에서 수행한다.
            if (fls != null) {
                try {
                    fls.close();
                }catch (IOException e) {
                    e.printStackTrace(); // 예외 발생시 호출스택에 있는 메서드의 정보와 예외 결과를 화면에 출력함
                }
            }
            System.out.println("항상 수행된다.");
        }
        System.out.println("여기도 수행된다.");
    }
}
