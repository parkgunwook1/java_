package school.alone.ch_1.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            if (fis != null) {
                try {
                    fis.close();   // try 블록에서 파일 리소스를 닫는 close() 메서드 호출
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println(e); // 예외 클래스의 toString() 메서드 호출
        }
        System.out.println("여기도 수행된다.");
    }
}
