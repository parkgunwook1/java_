package school.alone.ch_1.stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) throws IOException {
        System.out.println("알파벳 하나 쓰고 엔터를 누르세요");

        int i;
        try {
            i = System.in.read(); // 메서드로 한 바이트 읽음
            System.out.println(i); // 정수 출력
            System.out.println((char)i); // 문자 출력
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
