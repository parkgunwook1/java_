package school.ch1.together.study.ch19_io.file.run.ch06_data.run;

import java.io.*;

public class DataRun {

    public static void main(String[] args) {
        DataRun dr = new DataRun();
        dr.test2();
    }
    public static void test1() {
        //DataOutputStream : 기본자료형 + 문자열값을 출력할수 있도록 도와주는 보조스트림
        //FileOutputStream :

        File f = new File("sample.dat");

        try( DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))) { // new FileOutputStream() 을 f로 사용

            // 자바의 기본자료형별로 작성기능 지원
            dos.writeBoolean(true);
            dos.writeInt(3000);
            dos.writeDouble(3.14);
            dos.writeChar('안');
            dos.writeChar('녕');
            dos.writeUTF("자바자바자바");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("작업종료");
    }

    public static void test2() {
        File f = new File("sample.dat");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(f))){

            // 씌어지 자료형 순서대로 정확하게 읽어올것.
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
