package school.ch1.together.study.ch19_io.file.run.ch01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입,출력랄 수 있는 클래스
public class FileByteDao {


    // 현재 프로그램 -> 외부매체(ㅠㅏ일)
    // 출력 : 프로그램 내의 데이터를 파일로 내보내기(즉, 파일에 저장)
    public void fileSave() {

        // FileOutputStream : "파일"로 데이터를 1byte 단위로 출력하는 스트림.

        FileOutputStream fos = null;


        try {
            // 1. FileOutputStream 객체 생성 => 매개변수로 지정한 파일과 직접적으로 연결되는 통로 만듬
            // 해당 파일이 존재하지 않으면 해당 파일이 생성되면서 통로가 연결됨.
            // 이미 존재하는 파일이라면 즉시 통로가 연결됨.
            // 두번째 매개변수로 true 추가시 -> 기존에 해당파일이 있을 경우 "이어쓰기" 가능
            // 두번째 매개변수로 미작성시    -> 기존에 해당파일이 있더라도 "덮어씌우기"
            // fos = new FileOutputStream("a_byte.txt");  // 객체 덮어쓰기
            fos = new FileOutputStream("a_byte.txt", true);// 이어쓰기

            // 2. 연결통로로 데이터를 내보내기(출력) : write() 메소드 이용
            //   1byte의 범위 : -128 ~ 127 까지의 범위 (파일에 기록이 될때 해당 숫자의 고유한 문자가 기록됨)
            fos.write(97);  // a
            fos.write('b');
//            fos.write('민'); // 아스키코드 범위 벗어남 => 깨져서 보임

            byte[] arr = {99,100,101};
            fos.write(arr);

            fos.write(arr, 1, 2);// 1번 인덱스부터 2개만 기록해라. 100, 101

            // 3. 스트림을 사용했으면 반드시 자원 반납하기(반드시) why? 스트림은 고자원이기 때문
//            fos.close(); 위 코드에서 에러가 발생하는 경우 실행이 안될수 있다.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // 어떤 예외가 발생하든간에 반드시 실행하는 구문.

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 외부매체(파일) --- > 프로그램
    // 입력 : 파일로부터 데이터를 읽어들이겠다.
    public void fileRead() {
        // FileInputStream : 파일로부터 데이터를 1바이트씩 입력받는 스트림.
        FileInputStream fis = null;

        try {
            // 1. FileInputStream 객체로 입력 스트림 생성
            fis = new FileInputStream("a_byte.txt"); // 존재하는 파일의 경로 제시

            // 방법 1. 반복문을 활용하여 파일내부의 모든 데이터 읽어들이기
//            while(true) {
//                int value = 0;
//                value = fis.read();
//                if (value == -1) break;
//                System.out.print((char)value);  // ab�cdedeab�cdede
//            }
            int value = 0;
            // 방법 2
            while ((value = fis.read()) != -1) {
                System.out.print((char)value);
            }

            // 2. 통로로 데이터를 입력받기
//            System.out.println(fis.read()); // 1바이트 단위로 하나씩 데이터를 읽어들이는 함수.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 3. 다쓴 자원 반납
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
